package in.co.rays.project_3.controller;

public interface ORSView {
	
	public String APP_CONTEXT = "/project_3";

	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String ERROR_VIEW = PAGE_FOLDER + "/ErrorView404.jsp";


	public String MARKSHEET_VIEW = PAGE_FOLDER + "/MarksheetView.jsp";
	public String MARKSHEET_LIST_VIEW = PAGE_FOLDER + "/MarksheetListView.jsp";
	public String GET_MARKSHEET_VIEW = PAGE_FOLDER + "/GetMarksheetView.jsp";
	
	public String VEHICLE_TRACKING_VIEW = PAGE_FOLDER + "/VehicleTrackingView.jsp";
	public String VEHICLE_TRACKING_LIST_VIEW = PAGE_FOLDER + "/VehicleTrackingListView.jsp";
	public String VEHICLE_TRACKING_CTL = APP_CONTEXT + "/ctl/VehicleTrackingCtl";
	public String VEHICLE_TRACKING_LIST_CTL = APP_CONTEXT + "/ctl/VehicleTrackingListCtl";
	
	public String PATIENT_VIEW = PAGE_FOLDER + "/PatientView.jsp";
	public String PATIENT_LIST_VIEW = PAGE_FOLDER + "/PatientListView.jsp";
	public String PATIENT_CTL = APP_CONTEXT + "/ctl/PatientCtl";
	public String PATIENT_LIST_CTL = APP_CONTEXT + "/ctl/PatientListCtl";
	public String INVENTORY_VIEW = PAGE_FOLDER + "/InventoryView.jsp";
	public String INVENTORY_LIST_VIEW = PAGE_FOLDER + "/InventoryListView.jsp";
	public String INVENTORY_CTL = APP_CONTEXT + "/ctl/InventoryCtl";
	public String INVENTORY_LIST_CTL = APP_CONTEXT + "/ctl/InventoryListCtl";
	
	public String DOCTER_VIEW = PAGE_FOLDER + "/DocterView.jsp";
	public String DOCTER_LIST_VIEW = PAGE_FOLDER + "/DocterListView.jsp";
	public String DOCTER_CTL = APP_CONTEXT + "/ctl/DocterCtl";
	public String DOCTER_LIST_CTL = APP_CONTEXT + "/ctl/DocterListCtl";
	
	public String STOCKPURCHASE_VIEW = PAGE_FOLDER + "/StockPurchaseView.jsp";
	public String STOCKPURCHASE_LIST_VIEW = PAGE_FOLDER + "/StockPurchaseListView.jsp";
	public String STOCKPURCHASE_CTL = APP_CONTEXT + "/ctl/StockPurchaseCtl";
	public String STOCKPURCHASE_LIST_CTL = APP_CONTEXT + "/ctl/StockPurchaseListCtl";
	
	public String VECHICLE_VIEW = PAGE_FOLDER + "/VechicleView.jsp";
	public String VECHICLE_LIST_VIEW = PAGE_FOLDER + "/VechicleListView.jsp";
	public String VECHICLE_CTL = APP_CONTEXT + "/ctl/VechicleCtl";
	public String VECHICLE_LIST_CTL = APP_CONTEXT + "/ctl/VechicleListCtl";
	
	public String PORTFOLIOMANAGEMENT_VIEW = PAGE_FOLDER + "/PortfolioManagementView.jsp";
	public String PORTFOLIOMANAGEMENT_LIST_VIEW = PAGE_FOLDER + "/PortfolioManagementListView.jsp";
	public String PORTFOLIOMANAGEMENT_CTL = APP_CONTEXT + "/ctl/PortfolioManagementCtl";
	public String PORTFOLIOMANAGEMENT_LIST_CTL = APP_CONTEXT + "/ctl/PortfolioManagementListCtl";
	
	public String TRADE_VIEW = PAGE_FOLDER + "/TradeView.jsp";
	public String TRADE_LIST_VIEW = PAGE_FOLDER + "/TradeListView.jsp";
	public String TRADE_CTL = APP_CONTEXT + "/ctl/TradeCtl";
	public String TRADE_LIST_CTL = APP_CONTEXT + "/ctl/TradeListCtl";
	
	public String ENGEERING_VIEW = PAGE_FOLDER + "/EngeeringView.jsp";
	public String ENGEERING_LIST_VIEW = PAGE_FOLDER + "/EngeeringListView.jsp";
	public String ENGEERING_CTL = APP_CONTEXT + "/ctl/EngeeringCtl";
	public String ENGEERING_LIST_CTL = APP_CONTEXT + "/ctl/EngeeringListCtl";
	
	public String LOANS_VIEW = PAGE_FOLDER + "/LoansView.jsp";
	public String LOANS_LIST_VIEW = PAGE_FOLDER + "/LoansListView.jsp";
	public String LOANS_CTL = APP_CONTEXT + "/ctl/LoansCtl";
	public String LOANS_LIST_CTL = APP_CONTEXT + "/ctl/LoansListCtl";
	
	public String TRANSACTIONS_VIEW = PAGE_FOLDER + "/TransactionsView.jsp";
	public String TRANSACTIONS_LIST_VIEW = PAGE_FOLDER + "/TransactionsListView.jsp";
	public String TRANSACTIONS_CTL = APP_CONTEXT + "/ctl/TransactionsCtl";
	public String TRANSACTIONS_LIST_CTL = APP_CONTEXT + "/ctl/TransactionsListCtl";
	
	public String STOCKANALYSIS_VIEW = PAGE_FOLDER + "/StockAnalysisView.jsp";
	public String STOCKANALYSIS_LIST_VIEW = PAGE_FOLDER + "/StockAnalysisListView.jsp";
	public String STOCKANALYSIS_CTL = APP_CONTEXT + "/ctl/StockAnalysisCtl";
	public String STOCKANALYSIS_LIST_CTL = APP_CONTEXT + "/ctl/StockAnalysisListCtl";
	
	
	public String ROUTE_VIEW = PAGE_FOLDER + "/RouteView.jsp";
	public String ROUTE_LIST_VIEW = PAGE_FOLDER + "/RouteListView.jsp";
	public String ROUTE_CTL = APP_CONTEXT + "/ctl/RouteCtl";
	public String ROUTE_LIST_CTL = APP_CONTEXT + "/ctl/RouteListCtl";
	public String OWNER_VIEW = PAGE_FOLDER + "/OwnerView.jsp";
	public String OWNER_LIST_VIEW = PAGE_FOLDER + "/OwnerListView.jsp";
	public String OWNER_CTL = APP_CONTEXT + "/ctl/OwnerCtl";
	public String OWNER_LIST_CTL = APP_CONTEXT + "/ctl/OwnerListCtl";
	public String JOB_VIEW = PAGE_FOLDER + "/JobView.jsp";
	public String JOB_LIST_VIEW = PAGE_FOLDER + "/JobListView.jsp";
	public String JOB_CTL = APP_CONTEXT + "/ctl/JobCtl";
	public String JOB_LIST_CTL = APP_CONTEXT + "/ctl/JobListCtl";
	public String EMPLOYEE_VIEW = PAGE_FOLDER + "/EmployeeView.jsp";
	public String EMPLOYEE_LIST_VIEW = PAGE_FOLDER + "/EmployeeListView.jsp";
	public String EMPLOYEE_CTL = APP_CONTEXT + "/ctl/EmployeeCtl";
	public String EMPLOYEE_LIST_CTL = APP_CONTEXT + "/ctl/EmployeeListCtl";
	public String LOAN_VIEW = PAGE_FOLDER + "/LoanView.jsp";
	public String LOAN_LIST_VIEW = PAGE_FOLDER + "/LoanListView.jsp";
	public String LOAN_CTL = APP_CONTEXT + "/ctl/LoanCtl";
	public String LOAN_LIST_CTL = APP_CONTEXT + "/ctl/LoanListCtl";
	public String CLIENT_VIEW = PAGE_FOLDER + "/ClientView.jsp";
	public String CLIENT_LIST_VIEW = PAGE_FOLDER + "/ClientListView.jsp";
	public String CLIENT_CTL = APP_CONTEXT + "/ctl/ClientCtl";
	public String CLIENT_LIST_CTL = APP_CONTEXT + "/ctl/ClientListCtl";
	public String WISH_VIEW = PAGE_FOLDER + "/WishView.jsp";
	public String WISH_LIST_VIEW = PAGE_FOLDER + "/WishListView.jsp";
	public String WISH_CTL = APP_CONTEXT + "/ctl/WishCtl";
	public String WISH_LIST_CTL = APP_CONTEXT + "/ctl/WishListCtl";
	public String PRESCRIPTION_VIEW = PAGE_FOLDER + "/PrescriptionView.jsp";
	public String PRESCRIPTION_LIST_VIEW = PAGE_FOLDER + "/PrescriptionListView.jsp";
	public String PRESCRIPTION_CTL = APP_CONTEXT + "/ctl/PrescriptionCtl";
	public String PRESCRIPTION_LIST_CTL = APP_CONTEXT + "/ctl/PrescriptionListCtl";
	public String PROJECT_VIEW = PAGE_FOLDER + "/ProjectView.jsp";
	public String PROJECT_LIST_VIEW = PAGE_FOLDER + "/ProjectListView.jsp";
	public String PROJECT_CTL = APP_CONTEXT + "/ctl/ProjectCtl";
	public String PROJECT_LIST_CTL = APP_CONTEXT + "/ctl/ProjectListCtl";
	public String ORDER_VIEW = PAGE_FOLDER + "/OrderView.jsp";
	public String ORDER_LIST_VIEW = PAGE_FOLDER + "/OrderListView.jsp";
	public String ORDER_CTL = APP_CONTEXT + "/ctl/OrderCtl";
	public String ORDER_LIST_CTL = APP_CONTEXT + "/ctl/OrderListCtl";
	public String ISSUE_VIEW = PAGE_FOLDER + "/IssueView.jsp";
	public String ISSUE_LIST_VIEW = PAGE_FOLDER + "/IssueListView.jsp";
	public String ISSUE_CTL = APP_CONTEXT + "/ctl/IssueCtl";
	public String ISSUE_LIST_CTL = APP_CONTEXT + "/ctl/IssueListCtl";
	public String SALARY_VIEW = PAGE_FOLDER + "/SalaryView.jsp";
	public String SALARY_LIST_VIEW = PAGE_FOLDER + "/SalaryListView.jsp";
	public String SALARY_CTL = APP_CONTEXT + "/ctl/SalaryCtl";
	public String SALARY_LIST_CTL = APP_CONTEXT + "/ctl/SalaryListCtl";
	public String PRODUCT_VIEW = PAGE_FOLDER + "/ProductView.jsp";
	public String PRODUCT_LIST_VIEW = PAGE_FOLDER + "/ProductListView.jsp";
	public String PRODUCT_CTL = APP_CONTEXT + "/ctl/ProductCtl";
	public String PRODUCT_LIST_CTL = APP_CONTEXT + "/ctl/ProductListCtl";
	public String USER_VIEW = PAGE_FOLDER + "/UserView.jsp";
	public String USER_LIST_VIEW = PAGE_FOLDER + "/UserListView.jsp";
	public String COLLEGE_VIEW = PAGE_FOLDER + "/CollegeView.jsp";
	public String COLLEGE_LIST_VIEW = PAGE_FOLDER + "/CollegeListView.jsp";
	public String STUDENT_VIEW = PAGE_FOLDER + "/StudentView.jsp";
	public String STUDENT_LIST_VIEW = PAGE_FOLDER + "/StudentListView.jsp";
	public String ROLE_VIEW = PAGE_FOLDER + "/RoleView.jsp";
	public String ROLE_LIST_VIEW = PAGE_FOLDER + "/RoleListView.jsp";
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String WELCOME_VIEW = PAGE_FOLDER + "/Welcome.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";
	public String MARKSHEET_MERIT_LIST_VIEW = PAGE_FOLDER + "/MarksheetMeritListView.jsp";

	public String FACULTY_VIEW = PAGE_FOLDER + "/FacultyView.jsp";
	public String FACULTY_LIST_VIEW = PAGE_FOLDER + "/FacultyListView.jsp";
	public String COURSE_VIEW = PAGE_FOLDER + "/CourseView.jsp";
	public String COURSE_LIST_VIEW = PAGE_FOLDER + "/CourseListView.jsp";
	public String TIMETABLE_VIEW = PAGE_FOLDER + "/TimeTableView.jsp";
	public String TIMETABLE_LIST_VIEW = PAGE_FOLDER + "/TimeTableListView.jsp";
	public String SUBJECT_VIEW = PAGE_FOLDER + "/SubjectView.jsp";
	public String SUBJECT_LIST_VIEW = PAGE_FOLDER + "/SubjectListView.jsp";
	
	
	public String ERROR_CTL = APP_CONTEXT +"/ErrorCtl";

	public String MARKSHEET_CTL = APP_CONTEXT + "/ctl/MarksheetCtl";
	public String MARKSHEET_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetListCtl";
	public String USER_CTL = APP_CONTEXT + "/ctl/UserCtl";
	public String USER_LIST_CTL = APP_CONTEXT + "/ctl/UserListCtl";
	public String COLLEGE_CTL = APP_CONTEXT + "/ctl/CollegeCtl";
	public String COLLEGE_LIST_CTL = APP_CONTEXT + "/ctl/CollegeListCtl";
	public String STUDENT_CTL = APP_CONTEXT + "/ctl/StudentCtl";
	public String STUDENT_LIST_CTL = APP_CONTEXT + "/ctl/StudentListCtl";
	public String ROLE_CTL = APP_CONTEXT + "/ctl/RoleCtl";
	public String ROLE_LIST_CTL = APP_CONTEXT + "/ctl/RoleListCtl";
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";
	
	public String FACULTY_CTL = APP_CONTEXT + "/ctl/FacultyCtl";
	public String FACULTY_LIST_CTL = APP_CONTEXT + "/ctl/FacultyListCtl";
	public String COURSE_CTL = APP_CONTEXT + "/ctl/CourseCtl";
	public String COURSE_LIST_CTL = APP_CONTEXT + "/ctl/CourseListCtl";
	public String SUBJECT_CTL = APP_CONTEXT + "/ctl/SubjectCtl";
	public String SUBJECT_LIST_CTL = APP_CONTEXT + "/ctl/SubjectListCtl";
	public String TIMETABLE_CTL = APP_CONTEXT + "/ctl/TimeTableCtl";
	public String TIMETABLE_LIST_CTL = APP_CONTEXT + "/ctl/TimeTableListCtl";
	
	
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";
}
