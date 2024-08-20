package in.co.rays.project_3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.project_3.dto.BaseDTO;
import in.co.rays.project_3.dto.TransactionsDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.model.TransactionsModelInt;
import in.co.rays.project_3.model.ModelFactory;
import in.co.rays.project_3.util.DataUtility;
import in.co.rays.project_3.util.PropertyReader;
import in.co.rays.project_3.util.ServletUtility;

@WebServlet(name = "TransactionsListCtl", urlPatterns = { "/ctl/TransactionsListCtl" })

public class TransactionsListCtl extends BaseCtl {
	
protected void preload(HttpServletRequest request) {
		

	Map<Integer, String> map = new HashMap();
	map.put(1, "7896543211234");
	map.put(2, "5612368923445");
	map.put(3, "4122321245678");
	map.put(4, "3678923134545");
	map.put(5, "96543762176543");
	map.put(6, "7684209810542");
	map.put(7, "000034251783");
	map.put(8, "675221354677");
	request.setAttribute("account_idd", map);	
	
	Map<Integer, String> map1 = new HashMap();
	map1.put(1, "Cash");
	map1.put(2, "online");
	map1.put(3, "netbanking");
	map1.put(4, "cheque");
	

	request.setAttribute("transaction_typee", map1);

		
	    
	}

		
	

	@Override
	protected BaseDTO populateDTO(HttpServletRequest request) {
		TransactionsDTO dto = new TransactionsDTO();

		dto.setId(DataUtility.getLong(request.getParameter("id")));
		dto.setAccount_id(DataUtility.getInt(request.getParameter("account_id")));
		dto.setTransaction_type(DataUtility.getString(request.getParameter("transaction_type")));
		dto.setTransaction_date(DataUtility.getDate(request.getParameter("transaction_date")));
		dto.setDescription(DataUtility.getString(request.getParameter("description")));
		
		populateBean(dto, request);
		return dto;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List list;
		List next;
		int pageNo = 1;
		int pageSize = DataUtility.getInt(PropertyReader.getValue("page.size"));
		TransactionsDTO dto = (TransactionsDTO) populateDTO(request);

		TransactionsModelInt model = ModelFactory.getInstance().getTransactionsModel();
		try {
			list = model.search(dto, pageNo, pageSize);

			ArrayList a = (ArrayList<TransactionsDTO>) list;

			next = model.search(dto, pageNo + 1, pageSize);
			ServletUtility.setList(list, request);
			if (list == null || list.size() == 0) {
				ServletUtility.setErrorMessage("No record found ", request);
			}
			if (next == null || next.size() == 0) {
				request.setAttribute("nextListSize", 0);

			} else {
				request.setAttribute("nextListSize", next.size());
			}
			ServletUtility.setList(list, request);
			ServletUtility.setPageNo(pageNo, request);
			ServletUtility.setPageSize(pageSize, request);
			ServletUtility.forward(getView(), request, response);
		} catch (ApplicationException e) {
			ServletUtility.handleException(e, request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List list = null;
		List next = null;
		int pageNo = DataUtility.getInt(request.getParameter("pageNo"));
		int pageSize = DataUtility.getInt(request.getParameter("pageSize"));

		pageNo = (pageNo == 0) ? 1 : pageNo;
		pageSize = (pageSize == 0) ? DataUtility.getInt(PropertyReader.getValue("page.size")) : pageSize;
		TransactionsDTO dto = (TransactionsDTO) populateDTO(request);
		String op = DataUtility.getString(request.getParameter("operation"));

		String[] ids = request.getParameterValues("ids");
		TransactionsModelInt model = ModelFactory.getInstance().getTransactionsModel();
		try {

			if (OP_SEARCH.equalsIgnoreCase(op) || "Next".equalsIgnoreCase(op) || "Previous".equalsIgnoreCase(op)) {

				if (request.getParameter("description").equals("") && request.getParameter("transaction_date").equals("")
						&& request.getParameter("transaction_type").equals("") && request.getParameter("account_id").equals("")) {
					ServletUtility.setErrorMessage("fill  at least one field", request);
				}

				if (OP_SEARCH.equalsIgnoreCase(op)) {

					pageNo = 1;
				} else if (OP_NEXT.equalsIgnoreCase(op)) {
					pageNo++;
				} else if (OP_PREVIOUS.equalsIgnoreCase(op) && pageNo > 1) {
					pageNo--;
				}

			} else if (OP_NEW.equalsIgnoreCase(op)) {
				ServletUtility.redirect(ORSView.TRANSACTIONS_CTL, request, response);
				return;
			} else if (OP_RESET.equalsIgnoreCase(op)) {

				ServletUtility.redirect(ORSView.TRANSACTIONS_LIST_CTL, request, response);
				return;
			} else if (OP_DELETE.equalsIgnoreCase(op)) {
				pageNo = 1;
				if (ids != null && ids.length > 0) {
					TransactionsDTO deletedto = new TransactionsDTO();
					for (String id : ids) {
						deletedto.setId(DataUtility.getLong(id));
						model.delete(deletedto);
						ServletUtility.setSuccessMessage("Data Deleted Successfully", request);
					}
				} else {
					ServletUtility.setErrorMessage("Select at least one record", request);
				}
			}
			if (OP_BACK.equalsIgnoreCase(op)) {
				ServletUtility.redirect(ORSView.TRANSACTIONS_LIST_CTL, request, response);
				return;
			}
			dto = (TransactionsDTO) populateDTO(request);
			list = model.search(dto, pageNo, pageSize);

			ServletUtility.setDto(dto, request);
			next = model.search(dto, pageNo + 1, pageSize);

			ServletUtility.setList(list, request);
			ServletUtility.setList(list, request);
			if (list == null || list.size() == 0) {
				if (!OP_DELETE.equalsIgnoreCase(op)) {
					ServletUtility.setErrorMessage("No record found ", request);
				}
			}
			if (next == null || next.size() == 0) {
				request.setAttribute("nextListSize", 0);

			} else {
				request.setAttribute("nextListSize", next.size());
			}
			ServletUtility.setList(list, request);
			ServletUtility.setPageNo(pageNo, request);
			ServletUtility.setPageSize(pageSize, request);
			ServletUtility.forward(getView(), request, response);

		} catch (ApplicationException e) {
			ServletUtility.handleException(e, request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return ORSView.TRANSACTIONS_LIST_VIEW;
	}


}
