package in.co.rays.project_3.model;

import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * ModelFactory decides which model implementation run
 * 
 * @author Deepak Pandey
 *
 */
public final class ModelFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.project_3.bundle.system");
	private static final String DATABASE = rb.getString("DATABASE");
	private static ModelFactory mFactory = null;
	private static HashMap modelCache = new HashMap();

	
	private ModelFactory() {
 
	}

	public static ModelFactory getInstance() {
		if (mFactory == null) {
			mFactory = new ModelFactory();
		}
		return mFactory;
	}

	
	public UserModelInt getUserModel() {
		//UserModelInt userModel = null;
		UserModelInt userModel = (UserModelInt) modelCache.get("userModel");
		System.out.println(userModel);
		if (userModel == null) {
			
			if ("Hibernate".equals(DATABASE)) {
				userModel = new UserModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				userModel = new UserModelJDBCImpl();
			}
			System.out.println(DATABASE);
			modelCache.put("userModel", userModel);
		}

		return userModel;
	}
	
	
	
	
	public MarksheetModelInt getMarksheetModel() {
		MarksheetModelInt marksheetModel = (MarksheetModelInt) modelCache.get("marksheetModel");
		if (marksheetModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				marksheetModel = new MarksheetModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				marksheetModel = new MarksheetModelJDBCImpl();
			}
			modelCache.put("marksheetModel", marksheetModel);
		}
		return marksheetModel;
	}

	public CollegeModelInt getCollegeModel() {
		CollegeModelInt collegeModel = (CollegeModelInt) modelCache.get("collegeModel");
		if (collegeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				collegeModel = new CollegeModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				collegeModel = new CollegeModelJDBCImpl();
			}
			modelCache.put("collegeModel", collegeModel);
		}
		return collegeModel;
	}

	public RoleModelInt getRoleModel() {
		RoleModelInt roleModel = (RoleModelInt) modelCache.get("roleModel");
		if (roleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				roleModel = new RoleModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				roleModel = new RoleModelJDBCImpl();
			}
			modelCache.put("roleModel", roleModel);
		}
		return roleModel;
	}

	public StudentModelInt getStudentModel() { 
		StudentModelInt studentModel = (StudentModelInt) modelCache.get("studentModel");
		if (studentModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				studentModel = new StudentModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				studentModel = new StudentModelJDBCImpl();
			}
			modelCache.put("studentModel", studentModel);
		}

		return studentModel;
	}

	public CourseModelInt getCourseModel() {
		CourseModelInt courseModel = (CourseModelInt) modelCache.get("courseModel");
		if (courseModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				courseModel = new CourseModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				courseModel = new CourseModelJDBCImpl();
			}
			modelCache.put("courseModel", courseModel);
		}

		return courseModel;
	}

	public TimetableModelInt getTimetableModel() {

		TimetableModelInt timetableModel = (TimetableModelInt) modelCache.get("timetableModel");

		if (timetableModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				timetableModel = new TimetableModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				timetableModel = new TimetableModelJDBCImpl();
			}
			modelCache.put("timetableModel", timetableModel);
		}

		return timetableModel;
	}

	public SubjectModelInt getSubjectModel() {
		SubjectModelInt subjectModel = (SubjectModelInt) modelCache.get("subjectModel");
		if (subjectModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				subjectModel = new SubjectModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				subjectModel = new SubjectModelJDBCImpl();
			}
			modelCache.put("subjectModel", subjectModel);
		} 

		return subjectModel;
	}

	public FacultyModelInt getFacultyModel() {
		FacultyModelInt facultyModel = (FacultyModelInt) modelCache.get("facultyModel");
		if (facultyModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				facultyModel = new FacultyModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				facultyModel = new FacultyModelJDBCImpl();
			}
			modelCache.put("facultyModel", facultyModel);
		}

		return facultyModel;
	}
	public VehicleTrackingModelInt getVehicleTrackingModel() {

		VehicleTrackingModelInt vehicleModel = (VehicleTrackingModelInt) modelCache.get("vehicleModel");
		if (vehicleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				vehicleModel = new VehicleTrackingModelHibImp();
			}
			
			modelCache.put("vehicleModel", vehicleModel);
		}

		return vehicleModel;
	}
	
	public PatientModelInt getPatientModel() {

		PatientModelInt patientModel = (PatientModelInt) modelCache.get("patientModel");
		if (patientModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				patientModel = new PatientModelHibImp();
			}
			
			modelCache.put("patientModel", patientModel);
		}

		return patientModel;
	}
	public InventoryModelInt getInventoryModel() {

		InventoryModelInt inventoryModel = (InventoryModelInt) modelCache.get("inventoryModel");
		if (inventoryModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				inventoryModel = new InventoryModelHibImp();
			}
			
			modelCache.put("inventoryModel", inventoryModel);
		}

		return inventoryModel;
	}
	
	public DocterModelInt getDocterModel() {

		DocterModelInt docterModel = (DocterModelInt) modelCache.get("docterModel");
		if (docterModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				docterModel = new DocterModelHibImp();
			}
			
			modelCache.put("docterModel", docterModel);
		}

		return docterModel;
	}
	
	public RouteModelInt getRouteModel() {

		RouteModelInt routeModel = (RouteModelInt) modelCache.get("routeModel");
		if (routeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				routeModel = new RouteModelHibImp();
			}
			
			modelCache.put("routeModel", routeModel);
		}

		return routeModel;
	}
	
	public OwnerModelInt getOwnerModel() {

		OwnerModelInt ownerModel = (OwnerModelInt) modelCache.get("ownerModel");
		if (ownerModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				ownerModel = new OwnerModelHibImp();
			}
			
			modelCache.put("ownerModel", ownerModel);
		}

		return ownerModel;
	}
	public JobModelInt getJobModel() {

		JobModelInt jobModel = (JobModelInt) modelCache.get("jobModel");
		if (jobModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				jobModel = new JobModelHibImp();
			}
			
			modelCache.put("jobModel", jobModel);
		}

		return jobModel;
	}
	public ProductModelInt getProductModel() {

		ProductModelInt productModel = (ProductModelInt) modelCache.get("productModel");
		if (productModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				productModel = new ProductModelHibImp();
			}
			
			modelCache.put("productModel", productModel);
		}

		return productModel;
	}
	public SalaryModelInt getSalaryModel() {

		SalaryModelInt salaryModel = (SalaryModelInt) modelCache.get("salaryModel");
		if (salaryModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				salaryModel = new SalaryModelHibImp();
			}
			
			modelCache.put("salaryModel", salaryModel);
		}

		return salaryModel;
	}
	
	public EmployeeModelInt getEmployeeModel() {

		EmployeeModelInt employeeModel = (EmployeeModelInt) modelCache.get("employeeModel");
		if (employeeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				employeeModel = new EmployeeModelHibImp();
			}
			
			modelCache.put("employeeModel", employeeModel);
		}

		return employeeModel;
	}
	
	public OrderModelInt getOrderModel() {

		OrderModelInt orderModel = (OrderModelInt) modelCache.get("orderModel");
		if (orderModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				orderModel = new OrderModelHibImp();
			}
			modelCache.put("orderModel", orderModel);
		}

		return orderModel;
	}
	public IssueModelInt getIssueModel() {

		IssueModelInt issueModel = (IssueModelInt) modelCache.get("issuelModel");
		if (issueModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				issueModel = new IssueModelHibImp();
			}
			
			modelCache.put("issueNodel", issueModel);
		}

		return issueModel;
	}

	
	public ProjectModelInt getProjectModel() {

		ProjectModelInt projectModel = (ProjectModelInt) modelCache.get("projectModel");
		if (projectModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				projectModel = new ProjectModelHibImp();
			}
			
			modelCache.put("projectModel", projectModel);
		}

		return projectModel;
	}
	public LoanModelInt getLoanModel() {

		LoanModelInt loanModel = (LoanModelInt) modelCache.get("loanModel");
		if (loanModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				loanModel = new LoanModelHibImp();
			}
			
			modelCache.put("loanModel", loanModel);
		}

		return loanModel;
	}
	public ClientModelInt getClientModel() {

		ClientModelInt clientModel = (ClientModelInt) modelCache.get("clientModel");
		if (clientModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				clientModel = new ClientModelHibImp();
			}
			
			modelCache.put("clientModel", clientModel);
		}

		return clientModel;
	}
	public WishModelInt getWishModel() {

		WishModelInt wishModel = (WishModelInt) modelCache.get("wishModel");
		if (wishModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				wishModel = new WishModelHibImp();
			}
			
			modelCache.put("wishModel", wishModel);
		}

		return wishModel;
	}
	
	public PrescriptionModelInt getPrescriptionModel() {

		PrescriptionModelInt prescriptionModel = (PrescriptionModelInt) modelCache.get("prescriptionModel");
		if (prescriptionModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				prescriptionModel = new PrescriptionModelHibImp();
			}
			
			modelCache.put("prescriptionModel", prescriptionModel);
		}

		return prescriptionModel;
	}

	public VechicleModelInt getVechicleModel() {

		VechicleModelInt vechicleModel = (VechicleModelInt) modelCache.get("vechicleModel");
		if (vechicleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				vechicleModel = (VechicleModelInt) new VechicleModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("vechicleModel", vechicleModel);
		}
		return vechicleModel;

	}
	
	public PortfolioManagementModelInt getPortfolioManagementModel() {

		PortfolioManagementModelInt portfolioManagementModel = (PortfolioManagementModelInt) modelCache.get("portfolioManagementModel");
		if (portfolioManagementModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				portfolioManagementModel = (PortfolioManagementModelInt) new PortfolioManagementModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("portfolioManagementModel", portfolioManagementModel);
		}
		return portfolioManagementModel;

	}

	
	public TradeModelInt getTradeModel() {
		//UserModelInt userModel = null;
		TradeModelInt tradeModel = (TradeModelInt) modelCache.get("tradeModel");
		System.out.println(tradeModel);
		if (tradeModel == null) {
			
			if ("Hibernate".equals(DATABASE)) {
				tradeModel = new TradeModelHibImp();
			}
			System.out.println(DATABASE);
			modelCache.put("tradeModel", tradeModel);
		}

		return tradeModel;
	}
	
	public StockPurchaseModelInt getStockPurchaseModel() {
		//UserModelInt userModel = null;
		StockPurchaseModelInt stockPurchaseModel = (StockPurchaseModelInt) modelCache.get("stockPurchaseModel");
		System.out.println(stockPurchaseModel);
		if (stockPurchaseModel == null) {
			
			if ("Hibernate".equals(DATABASE)) {
				stockPurchaseModel = new StockPurchaseModelHibImp();
			}
			System.out.println(DATABASE);
			modelCache.put("stockPurchaseModel", stockPurchaseModel);
		}

		return stockPurchaseModel;
	}
	
	public StockAnalysisModelInt getStockAnalysisModel() {
		//UserModelInt userModel = null;
		StockAnalysisModelInt stockAnalysisModel = (StockAnalysisModelInt) modelCache.get("stockAnalysisModel");
		System.out.println(stockAnalysisModel);
		if (stockAnalysisModel == null) {
			
			if ("Hibernate".equals(DATABASE)) {
				stockAnalysisModel = new StockAnalysisModelHibImp();
			}
			System.out.println(DATABASE);
			modelCache.put("stockAnalysisModel", stockAnalysisModel);
		}

		return stockAnalysisModel;
	}
	
	public LoansModelInt getLoansModel() {

		LoansModelInt loansModel = (LoansModelInt) modelCache.get("loansModel");
		if (loansModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				loansModel = new LoansModelHibImp();
			}
			
			modelCache.put("loansModel", loansModel);
		}

		return loansModel;
	}
	
	
	public TransactionsModelInt getTransactionsModel() {

		TransactionsModelInt transactionsModel = (TransactionsModelInt) modelCache.get("transactionsModel");
		if (transactionsModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				transactionsModel = new TransactionsModelHibImp();
			}
			
			modelCache.put("transactionsModel", transactionsModel);
		}

		return transactionsModel;
	}
	
	public EngeeringModelInt getEngeeringModel() {

		EngeeringModelInt engeeringModel = (EngeeringModelInt) modelCache.get("engeeringModel");
		if (engeeringModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				engeeringModel = new EngeeringModelHibImp();
			}
			
			modelCache.put("engeeringModel", engeeringModel);
		}

		return engeeringModel;
	}
	
}
