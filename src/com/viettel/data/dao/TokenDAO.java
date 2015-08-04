package com.viettel.data.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.viettel.data.model.entity.VtStToken;
import com.viettel.data.query.TokenQuery;
import com.viettel.util.HibernateUtil;
import com.viettel.util.LogUtils;
import com.viettel.util.StringUtil;

public class TokenDAO {
	private static final String TAG = TokenDAO.class.getSimpleName();

	public static TokenDAO instance = null;

	private Session getSession() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		return session;
	}

	private TokenDAO() {
	}

	public static TokenDAO getInstance() {
		if (instance == null) {
			instance = new TokenDAO();
		}
		return instance;
	}

	public Long getNextIndex() {
		Long index = 0L;
		try {
			index = HibernateUtil.getSequence("VT_ST_TOKEN_SEQ");
		} catch (Exception e) {
			index = -1L;
		}
		return index;
	}

	public String creatFullServerToken(String shortToken) {
		
		return "";
	}

	public VtStToken createNewToken(Long userId) {

		String tokenString = StringUtil.getRandomTokenString();
		String fullTokenString = creatFullServerToken(tokenString);
		Long startTime = com.viettel.util.DateUtils.getInstance().getCurrentTime();

		VtStToken token = new VtStToken();
		token.setTokenString(tokenString);
		token.setUserId(userId);
		token.setStartTime(startTime);
		token.setFullTokenString(fullTokenString);

		LogUtils.d(TAG, "Successfully creating token.");
		return token;
	}

	public boolean insertToken(VtStToken token) {
		try {
			getSession().save(token);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean updateToken(VtStToken token) {
		try {
			getSession().update(token);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public VtStToken getTokenByUserID(Long userId) {
		Query query = getSession().getNamedQuery(TokenQuery.GET_TOKEN_BY_USER_ID_NAME);
		query.setParameter("userId", userId);
		List<VtStToken> lstToken = query.list();
		if (lstToken.isEmpty()) {
			return null;
		}
		return lstToken.get(0);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<VtStToken> getAllToken() {
		Query query = getSession().getNamedQuery(TokenQuery.GET_ALL_TOKEN_NAME);
		List<VtStToken> lstToken = query.list();
		return lstToken;
	}

	/**
	 * @param token
	 * @return
	 */
	public boolean removeToken(VtStToken token) {
		try {
			getSession().delete(token);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * @param userId
	 * @return
	 */
	public boolean removeTokenByUserId(Long userId) {
		try {
			Query query = getSession().createSQLQuery(TokenQuery.REMOVE_TOKEN_BY_USER_ID);
			query.setParameter("userId", userId);
			query.executeUpdate();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
