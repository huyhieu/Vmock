package GlobalDefine;

/**
 * 
 * @author hieuph
 *
 */
public class EmailConfig {

	public static final String host = "203.113.131.19";
	public static final String port = "465";
	public static final String auth = "false";

	public static final String from = "hieunq5@viettel.com.vn";
	public static final String password = "Xe3yOoyOrrPBNp6u+bhrwmXcxVJxuYt5";

	public static final String subject_invitation = "[Viettel App Store] Send invitation";
	public static final String subject_resend_invitation = "[Viettel App Store] Resend invitation";

	// Email lien he trong moi email gui toi nguoi dung
	public static final String ip_contact = "https://viettelappstore.com:19086/VPMTStore";
	//public static final String ip_contact = "http://10.60.15.93:9511/VPMTStoreBT";
	public static final String email_contact = "chaultm3@viettel.com.vn";
	public static final String contact_detail_content_email = "If you have any question, please email us at " + email_contact + "<br>Thanks," + "<br>VTApp Store Team.";

	// REGISTER
	public static final String register_link_verify = ip_contact + "/getVerifyInformation.do";
	public static final String register_subject_verify_register_account = "[Viettel App Store] Verify Register Account";
	public static final String register_content_email_msg_01 = "You recently asked to register VTApp Store Account. To complete your request, please follow this link: ";
	public static final String register_content_email_msg_02 = "If you are not registered, please click or copy the following link to remove: ";

	// REVIEWS
	public static final String PUBLISH_APP_SUBJECT = "Invite to review application information";
	public static final String review_show_app_detail = ip_contact + "/showReviewAppDetail.do";

	// "VTApp Store Team.";
	// FORGOT PASSWORD
	public static final String linkForgotPass = ip_contact + "/verifyForgotPassword.do";

	public static final String forgot_content_email_msg_01 = "You recently asked to reset your VTApp Store Account password. To complete your request, please follow this link: ";
	public static final String forgot_content_email_msg_05 = "[Viettel App Store] - Confirm Reset Password";

	// Content Email Send New Password
	public static final String forgot_content_email_msg_06 = "[Viettel App Store] - New Password";
	public static final String forgot_content_email_msg_07 = "The new password to login VTApp Store:";

	public static final String sendMailSuccessful = "success";
	public static final String sendMailFail = "fail";
	public static final String sendMailError = "error";
	public static final String sendMailReady = "ready";
	public static final String sendMailNotExisted = "notexisted";
	public static final String account_locked = "locked";
	public static final String account_not_actived = "notactived";
	public static final String verifyName = "verifyResult";

	public static final String SUBJECT_INVITE_USER = "Management invites applications";
}
