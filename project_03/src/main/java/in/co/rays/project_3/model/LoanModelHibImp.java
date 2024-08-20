package in.co.rays.project_3.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import in.co.rays.project_3.dto.LoanDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.util.HibDataSource;

public class LoanModelHibImp implements LoanModelInt {

	
	
	@Override
	public long add(LoanDTO dto) throws ApplicationException, DuplicateRecordException {
		

		LoanDTO existDto = null;
		
		Session session = HibDataSource.getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.save(dto);

			dto.getId();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();

			}
			throw new ApplicationException("Exception in Product Add " + e.getMessage());
		} finally {
			session.close();
		}
		return dto.getId();

	}

	@Override
	public void delete(LoanDTO dto) throws ApplicationException {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibDataSource.getSession();
			tx = session.beginTransaction();
			session.delete(dto);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new ApplicationException("Exception in Product Delete" + e.getMessage());
		} finally {
			session.close();
		}
	}
		
	

	@Override
	public void update(LoanDTO dto) throws ApplicationException, DuplicateRecordException {
		Session session = null;
		/*
		 * Transaction tx = null; LoanDTO exesistDto = findByLogin(dto.getLogin());
		 * 
		 * if (exesistDto != null && exesistDto.getId() != dto.getId()) { throw new
		 * DuplicateRecordException("Login id already exist"); }
		 */
		Transaction tx = null;

		try {
			session = HibDataSource.getSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(dto);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new ApplicationException("Exception in Product update" + e.getMessage());
		} finally {
			session.close();
		}
		
	}

	@Override
	public LoanDTO findByPK(long pk) throws ApplicationException {
		Session session = null;
		LoanDTO dto = null;
		try {
			session = HibDataSource.getSession();
			dto = (LoanDTO) session.get(LoanDTO.class, pk);

		} catch (HibernateException e) {
			throw new ApplicationException("Exception : Exception in getting Product by pk");
		} finally {
			session.close();
		}

		return dto;

	}

	@Override
	public LoanDTO findByLogin(String login) throws ApplicationException {
		Session session = null;
		LoanDTO dto = null;
		try {
			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(LoanDTO.class);
			criteria.add(Restrictions.eq("login", login));
			List list = criteria.list();
			if (list.size() == 1) {
				dto = (LoanDTO) list.get(0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new ApplicationException("Exception in getting Product by Login " + e.getMessage());

		} finally {
			session.close();
		}

		return dto;
	}
	@Override
	public List list() throws ApplicationException {
		return list(0, 0);

	}

	@Override
	public List list(int pageNo, int pageSize) throws ApplicationException {
		Session session = null;
		List list = null;
		try {
			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(LoanDTO.class);
			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;
				criteria.setFirstResult(pageNo);
				criteria.setMaxResults(pageSize);

			}
			list = criteria.list();

		} catch (HibernateException e) {
			throw new ApplicationException("Exception : Exception in  Products list");
		} finally {
			session.close();
		}

		return list;
	}

	
	
	@Override
	public List search(LoanDTO dto, int pageNo, int pageSize) throws ApplicationException {
		Session session = null;
		ArrayList<LoanDTO> list = null;
		try {
			session = HibDataSource.getSession();
			Criteria criteria = session.createCriteria(LoanDTO.class);
			if (dto != null) {
				if (dto.getId() != null && dto.getId() > 0) {
					criteria.add(Restrictions.eq("id", dto.getId()));
				}
				if (dto.getLoanStartDate() != null && dto.getLoanStartDate().getTime() > 0) {
					criteria.add(Restrictions.eq("loanStartDate", dto.getLoanStartDate()));
				}				
				  if (dto.getCustomerId()!= null && dto.getCustomerId().length() > 0) {
					  criteria.add(Restrictions.like("customerId", dto.getCustomerId() + "%" ));
					  }


				  if (dto.getLoanAmount() > 0) {
				  criteria.add(Restrictions.eq("loanAmount", dto.getLoanAmount() ));
				  }

				  if (dto.getIntrestRate() > 0) {
				  criteria.add(Restrictions.eq("intrestRate", dto.getIntrestRate() ));
				  }

					

				
				
			}
			
			System.out.println("searchcalll");
			// if pageSize is greater than 0
			if (pageSize > 0) {
				pageNo = (pageNo - 1) * pageSize;
				criteria.setFirstResult(pageNo);
				criteria.setMaxResults(pageSize);
			}
			list = (ArrayList<LoanDTO>) criteria.list();
		} catch (HibernateException e) {
			throw new ApplicationException("Exception in Product search");
		} finally {
			session.close();
		}

		return list;
	}
	

	@Override
	public List search(LoanDTO dto) throws ApplicationException {
		return search(dto, 0, 0);
		
	}

	@Override
	public List getRoles(LoanDTO dto) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}