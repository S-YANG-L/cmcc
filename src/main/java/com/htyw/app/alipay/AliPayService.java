package com.htyw.app.alipay;

import org.springframework.stereotype.Service;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

//import com.alipay.api.AlipayClient;
//import com.alipay.api.DefaultAlipayClient;

@Service
public class AliPayService {

	/** 应用的APP_ID，示例：2016111600063951 */		
	public static final String APP_ID = "2016100100636042";

	/** 商家的私钥. */
	public static final String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCaHa5NvmIg2IvB/bl50R3Z+q10HhWxRbu5hlSqH/9/P6CEwJC2BHAQ4oQCLN4JjSW/RCS4lwpAVVEVUTLWbGa9X0A1HdCAWMOfY1NjlHSYJE41arB3pkE1ezk8HeXQyS5uKmXzhihbkbbUsRwF3dsy2OOUyO3UnVZLd8v1HUbKxEggQYH54SPnk7KX8Z4rlcwXrUytCLTdA6W/Mpu9W/GofW9JS1ld+PAVwueIz9+UY3IZuPhCms3+NTcjUy7OosNRTz9oo1zb3dxqyjZGB4jTWP1FPXcO1PHDPScYzDA8mlMmb/dGpLiH8O0n/j/RJ8N+JyX5v7H82WTOEMFMwOQFAgMBAAECggEAQqpGJNEO54BkbCTR33Tqwcji0RDWd1lfy+/knba7sZKXX/VgY6vlwhgJ3FsGLQGGa4cRj1uejpeZPGxkXkaD5rTWNGPSNkKvVDoF71RfXxSNVCPzc75SBM1pw6x3JepwkCz87uuAd6O/f5+hLJR8ZjFVuJ1163unwXtvmXbxkXHH/sUejf+tFlaR5ZDLFeWYHkAdQGimDqUhMfT29B5mavhJ0kt7RJI+qVkLTXcemQeu9nYGgva3F1aDiuKmLoDhv0mJweRSIah2ElHq+XSSXqDvRZJuECa9thee9tw6JIrnQEjVv3vsd+fzHc4Y+fUcOJPBXG0wMOwvgNq1DbfCHQKBgQD6Vqt+EhlIfAT+tNYjL4eGKG9IQYviO+f6Vsviofs72zdZvtapZ+tn1i7Bvwy059ZedUe8MVTwyoQaEkUkFn+2PQGtLywrJq/OcafQ7gnuyCeglRg/ezC2AE0NRVpfNFDy6XMHVzlfrBco16LtnygZO61mweiSBZM57gd6bYTVTwKBgQCdme6bzZKaykeDw3DddCuxmq4v57NFcmt0Jo9VSQXTCeNGxx5e4vnqku5YbOsET9yNbsZ9bcuaMlTzjPwm+UWbmA/CJPdTLJmrzoeM9x4fFdiIKhWP1Wk2b2L07s3/cPA4vO22PN27/rZ+ifol4hRqQ8ax17UzlCdzmtXLwhGEawKBgQDaCNKkoy7SKvJOxUIcszDecCk8TZqAGJ0bNK2vXlVq9KtoxwY/1fr6HVnr9XIjvii/bHZmOrE4Z6pW6sK9g7sIBmqHZCacDr3gmK0JE8oi5sFc436TC8CJRAnYHSdw9Cfs6db99cJKyaACOo31WEGceJW2gf0F8UUhl2d8AhdHkQKBgF6jwGipQx9W1ykl5RHnIBHwHCfCUKIkeqhuO2ZwimHXrzaiffdm/8LAZwaMqXiWaJA59FH/6+L11JPIlubki8tKvjPMtQSqZMGKLVYWU21BVh02gGo2Mo8wxlDlUqjRbj/0HB9yX4j0BSzpuGClabMCbj//k92cWzCNy1MngBNvAoGBAKh5rr0cbC6nKOC8o5VNwzXIaZFEeW43GH/vpzHXdeTIvg9OXBYQ04rSiDBQbssvrLdo9WIIh4fpwTYPDP2cIdOs/GFiZci7Uv/hfiaaj2R+ZYoIxs0upwz8+opIKZAWfdRVPifYOe+tMd72mSwaP4q9KZ3ennLII0OPg/hD6UQ3";

	/** 蚂蚁的公钥. */
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkQqkYCfxeiZ7R6Bd7+5lpXfld2XbvhCB0fL1+7Udt2+gLKs/NzfUTma6hgFgSZxsfQc+VNT3kmaI1tpSNad3JYMwS73gFGZ0NTinC8StKaDoRjUua7rjlr0v8NoyYCQqrH4znDGG0znnTzdgfUYFsqPmAEv+YnF0qnoFyh3Skwqx/kYNeDNXH+8RZ1LfXAVnfWN/HgPUN/6ca+7HtYJHErF1bmDBovtJVaN4Lcu+RL5L0fB/CfqVaKX78UmSB/7AqQSS79DIf7lcNUbZp7xrZ2IZrSGNe4XGnsmT3weiLsgRVbUAob1/tpnPBPiMxH5bcMSKFj9CWHpvuBVp3aLGpQIDAQAB";

	/**
	 * 蚂蚁网关的url. 线上：https://openapi.alipay.com/gateway.do <br>
	 * 沙箱环境:https://openapi.alipaydev.com/gateway.do
	 */
	public static final String GETWAY_URL = "https://openapi.alipay.com/gateway.do";
	public static final String GETWAY_URL1 = "https://openapi.alipaydev.com/gateway.do";

	/** JSON 应格式 */
	public static final String FORMAT_JSON = "json";

	/** UTF-8字符集 **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** alli */
	public AlipayClient alipayClient;

	/**
	 * 得到alpay对象
	 */
	public AliPayService() {
		System.out.println("AliPayService启动{}");
		// TODO Auto-generated method stub
			AlipayClient alipayClient = new DefaultAlipayClient(GETWAY_URL1, 
				APP_ID,
			PRIVATE_KEY,
				FORMAT_JSON, 
				CHARSET_UTF8,
				ALIPAY_PUBLIC_KEY,
				"RSA2");
		this.alipayClient = alipayClient;
	}

}
