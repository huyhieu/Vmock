/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viettel.data.query;

/**
 *
 * @author hieuph
 */
public class TesterTokenQuery {

    public static final String GET_ALL_TESTER_TOKEN_NAME = "get_all_tester_token";
    public static final String GET_ALL_TESTER_TOKEN = "{? = call get_all_tester_token()}"; // ok
    
    public static final String GET_TESTER_TOKEN_BY_TESTER_ID_NAME = "get_tester_token_by_tester_id";
    public static final String GET_TESTER_TOKEN_BY_TESTER_ID = "{? = call get_tester_token_by_tester_id(:userId, :deviceId)}";
    
    // REMOVE
//    public static final String REMOVE_TESTER_TOKEN_BY_ID = "{Call remove_tester_token_by_id(:userId)}"; //ok
}
