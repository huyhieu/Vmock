package com.viettel.data.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.viettel.data.model.entity.VtStTesterToken;
import com.viettel.data.query.TesterTokenQuery;
import com.viettel.util.HibernateUtil;

public class TesterTokenDAO {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public static TesterTokenDAO instace = null;

	private TesterTokenDAO() {
	}

	public static TesterTokenDAO getInstance() {
		if (instace == null) {
			instace = new TesterTokenDAO();
		}
		return instace;
	}

	public Long getNextIndex() {
		Long index = 0L;
		try {
			index = HibernateUtil.getSequence("VT_ST_TESTER_TOKEN_SEQ");
		} catch (Exception e) {
			index = -1L;
		}
		return index;
	}

	/**
	 * @param testerToken
	 * @return
	 */
	public boolean insertTesterToken(VtStTesterToken testerToken) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(testerToken);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	/**
	 * @param app
	 * @return
	 */
	public boolean deleteTesterToken(VtStTesterToken testerToken) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(testerToken);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<VtStTesterToken> getAllTesterToken() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Query query = session
				.getNamedQuery(TesterTokenQuery.GET_ALL_TESTER_TOKEN_NAME);// ok
		List<VtStTesterToken> lstTesterTokens = query.list();
		session.close();
		return lstTesterTokens;
	}

	/**
	 * @param testerId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public VtStTesterToken getTesterTokenByTesterId(Long userId,
			String deviceId) {
		List<VtStTesterToken> lstTesterTokens = null;
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		try {
			Query query = session
					.getNamedQuery(TesterTokenQuery.GET_TESTER_TOKEN_BY_TESTER_ID_NAME);// fix
			query.setParameter("userId", userId);
			query.setParameter("deviceId", deviceId);
			lstTesterTokens = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		if (lstTesterTokens.isEmpty()) {
			return null;
		}
		return lstTesterTokens.get(0);
	}

	/**
	 * @param testerId
	 * @return
	 */
//	public boolean removeTesterTokenById(Long userId) {
//		Session session = HibernateUtil.getSession();
//		session.beginTransaction();
//		try {
//			Query query = session
//					.createSQLQuery(TesterTokenQuery.REMOVE_TESTER_TOKEN_BY_ID);
//			query.setParameter("userId", userId);
//			query.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			return false;
//		} finally {
//			session.close();
//		}
//		return true;
//	}
}
