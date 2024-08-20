package in.co.rays.project_3.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.project_3.dto.BaseDTO;
import in.co.rays.project_3.dto.RouteDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.model.RouteModelInt;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.util.DataValidator;
import in.co.rays.project_3.util.PropertyReader;
import in.co.rays.project_3.util.ServletUtility;

@WebServlet(name = "RouteCtl", urlPatterns = { "/ctl/RouteCtl" })
public class RouteCtl extends BaseCtl {
	
	
	protected void preload(HttpServletRequest request) {
		HashMap map = new HashMap();
		map.put("mp09", "mp09");
		map.put("mp08", "mp08");
		map.put("mp07", "mp07");
		map.put("mp06", "mp06");
		map.put("mp05", "mp05");
		

		request.setAttribute("routep", map);

	}

	protected boolean validate(HttpServletRequest request) {
		boolean pass = true;

		if (DataValidator.isNull(request.getParameter("name"))) {
			request.setAttribute("name", PropertyReader.getValue("error.require", "name"));
			pass = false;
		

		}  

		if (DataValidator.isNull(request.getParameter("allowedSpeed"))) {
			request.setAttribute("allowedSpeed", PropertyReader.getValue("error.require", "allowedSpeed"));
			pass = false;
		} else if (!DataValidator.isSpeedLimit(request.getParameter("allowedSpeed")))
		  { request.setAttribute("allowedSpeed",
		  " Allowed Speed must be between 0 an 100 ");
		  System.out.println(pass);
		  pass =  false;
				  
		 }
		
	

		
			if (DataValidator.isNull(request.getParameter("vehicleID"))) {
				request.setAttribute("vehicleID", PropertyReader.getValue("error.require", "vehicleID"));
				pass = false;
			}

			if (DataValidator.isNull(request.getParameter("startDate"))) {
				request.setAttribute("startDate", PropertyReader.getValue("error.require", "startDate"));
				pass = false;

			}


		return pass;
	}

	protected BaseDTO populateDTO(HttpServletRequest request) {
		RouteDTO dto = new RouteDTO();

		System.out.println(request.getParameter("date"));

		dto.setId(DataUtility.getLong(request.getParameter("id")));
		dto.setName(DataUtility.getString(request.getParameter("name")));
		dto.setAllowedSpeed(DataUtility.getInt(request.getParameter("allowedSpeed")));
		dto.setStartDate(DataUtility.getDate(request.getParameter("startDate")));
		dto.setVehicleID(DataUtility.getString(request.getParameter("vehicleID")));

		populateBean(dto, request);

		return dto;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String op = DataUtility.getString(request.getParameter("operation"));
		RouteModelInt model = ModelFactory.getInstance().getRouteModel();
		long id = DataUtility.getLong(request.getParameter("id"));
		if (id > 0 || op != null) {
			RouteDTO dto;
			try {
				dto = model.findByPK(id);
				ServletUtility.setDto(dto, request);
			} catch (Exception e) {
				e.printStackTrace();
				ServletUtility.handleException(e, request, response);
				return;
			}
		}
		ServletUtility.forward(getView(), request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String op = DataUtility.getString(request.getParameter("operation"));
		RouteModelInt model = ModelFactory.getInstance().getRouteModel();
		long id = DataUtility.getLong(request.getParameter("id"));
		if (OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {
			RouteDTO dto = (RouteDTO) populateDTO(request);
			try {
				if (id > 0) {
					model.update(dto);

					ServletUtility.setSuccessMessage("Data is successfully Update", request);
				} else {

					try {
						model.add(dto);

						ServletUtility.setDto(dto, request);
						ServletUtility.setSuccessMessage("Data is successfully saved", request);
					} catch (ApplicationException e) {
						ServletUtility.handleException(e, request, response);
						return;
					} catch (DuplicateRecordException e) {
						ServletUtility.setDto(dto, request);
						ServletUtility.setErrorMessage("Login id already exists", request);
					}

				}
				ServletUtility.setDto(dto, request);

			} catch (ApplicationException e) {
				ServletUtility.handleException(e, request, response);
				return;
			} catch (DuplicateRecordException e) {
				ServletUtility.setDto(dto, request);
				ServletUtility.setErrorMessage("Login id already exists", request);
			}
		} else if (OP_DELETE.equalsIgnoreCase(op)) {

			RouteDTO dto = (RouteDTO) populateDTO(request);
			try {
				model.delete(dto);
				ServletUtility.redirect(ORSView.ROUTE_LIST_CTL, request, response);
				return;
			} catch (ApplicationException e) {
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_CANCEL.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.ROUTE_LIST_CTL, request, response);
			return;
		} else if (OP_RESET.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.ROUTE_CTL, request, response);
			return;
		}
		ServletUtility.forward(getView(), request, response);

	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.ROUTE_VIEW;
	}

}
