package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.EngeeringDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;

public interface EngeeringModelInt {
	
	public long add(EngeeringDTO dto)throws ApplicationException,DuplicateRecordException;
	public void delete(EngeeringDTO dto)throws ApplicationException;
	public void update(EngeeringDTO dto)throws ApplicationException,DuplicateRecordException;
	public EngeeringDTO findByPK(long pk)throws ApplicationException;
	public EngeeringDTO findByLogin(String login)throws ApplicationException;
	public List list()throws ApplicationException;
	public List list(int pageNo,int pageSize)throws ApplicationException;
	public List search(EngeeringDTO dto,int pageNo,int pageSize)throws ApplicationException;
	public List search(EngeeringDTO dto)throws ApplicationException;
	public List getRoles(EngeeringDTO dto)throws ApplicationException;
	

}
