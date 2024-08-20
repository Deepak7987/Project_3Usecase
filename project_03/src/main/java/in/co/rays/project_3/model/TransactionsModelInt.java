package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.TransactionsDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;

public interface TransactionsModelInt {
	
	public long add(TransactionsDTO dto)throws ApplicationException,DuplicateRecordException;
	public void delete(TransactionsDTO dto)throws ApplicationException;
	public void update(TransactionsDTO dto)throws ApplicationException,DuplicateRecordException;
	public TransactionsDTO findByPK(long pk)throws ApplicationException;
	public TransactionsDTO findByLogin(String login)throws ApplicationException;
	public List list()throws ApplicationException;
	public List list(int pageNo,int pageSize)throws ApplicationException;
	public List search(TransactionsDTO dto,int pageNo,int pageSize)throws ApplicationException;
	public List search(TransactionsDTO dto)throws ApplicationException;
	public List getRoles(TransactionsDTO dto)throws ApplicationException;
	

}
