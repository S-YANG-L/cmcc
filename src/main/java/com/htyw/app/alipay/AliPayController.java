package com.htyw.app.alipay;

import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.htyw.app.alipay.ReturnObject;

@RestController
@RequestMapping(value="moveAlipay")
public class AliPayController {
	
	@Autowired AliPayService aliPayService;
	
	/**
	 * 
	 * @return
	 * @author lshao
	 * 支付宝支付
	 */
	@RequestMapping(value = "zfbPay")
	@ResponseBody
 	public JSONObject zfbPay(HttpServletRequest request,HttpServletResponse response)throws Exception{
 	    // 1、获取参数
 		String outTradeNo = request.getParameter("outTradeNo");
 		String totalAmount = request.getParameter("totalAmount");
 		 totalAmount = "0.1";
 		JSONObject jsonRes = new JSONObject();
 		
 		// 2、实例化客户端
// 		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
// 				"2019042364309223",
// 				"MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCaHa5NvmIg2IvB/bl50R3Z+q10HhWxRbu5hlSqH/9/P6CEwJC2BHAQ4oQCLN4JjSW/RCS4lwpAVVEVUTLWbGa9X0A1HdCAWMOfY1NjlHSYJE41arB3pkE1ezk8HeXQyS5uKmXzhihbkbbUsRwF3dsy2OOUyO3UnVZLd8v1HUbKxEggQYH54SPnk7KX8Z4rlcwXrUytCLTdA6W/Mpu9W/GofW9JS1ld+PAVwueIz9+UY3IZuPhCms3+NTcjUy7OosNRTz9oo1zb3dxqyjZGB4jTWP1FPXcO1PHDPScYzDA8mlMmb/dGpLiH8O0n/j/RJ8N+JyX5v7H82WTOEMFMwOQFAgMBAAECggEAQqpGJNEO54BkbCTR33Tqwcji0RDWd1lfy+/knba7sZKXX/VgY6vlwhgJ3FsGLQGGa4cRj1uejpeZPGxkXkaD5rTWNGPSNkKvVDoF71RfXxSNVCPzc75SBM1pw6x3JepwkCz87uuAd6O/f5+hLJR8ZjFVuJ1163unwXtvmXbxkXHH/sUejf+tFlaR5ZDLFeWYHkAdQGimDqUhMfT29B5mavhJ0kt7RJI+qVkLTXcemQeu9nYGgva3F1aDiuKmLoDhv0mJweRSIah2ElHq+XSSXqDvRZJuECa9thee9tw6JIrnQEjVv3vsd+fzHc4Y+fUcOJPBXG0wMOwvgNq1DbfCHQKBgQD6Vqt+EhlIfAT+tNYjL4eGKG9IQYviO+f6Vsviofs72zdZvtapZ+tn1i7Bvwy059ZedUe8MVTwyoQaEkUkFn+2PQGtLywrJq/OcafQ7gnuyCeglRg/ezC2AE0NRVpfNFDy6XMHVzlfrBco16LtnygZO61mweiSBZM57gd6bYTVTwKBgQCdme6bzZKaykeDw3DddCuxmq4v57NFcmt0Jo9VSQXTCeNGxx5e4vnqku5YbOsET9yNbsZ9bcuaMlTzjPwm+UWbmA/CJPdTLJmrzoeM9x4fFdiIKhWP1Wk2b2L07s3/cPA4vO22PN27/rZ+ifol4hRqQ8ax17UzlCdzmtXLwhGEawKBgQDaCNKkoy7SKvJOxUIcszDecCk8TZqAGJ0bNK2vXlVq9KtoxwY/1fr6HVnr9XIjvii/bHZmOrE4Z6pW6sK9g7sIBmqHZCacDr3gmK0JE8oi5sFc436TC8CJRAnYHSdw9Cfs6db99cJKyaACOo31WEGceJW2gf0F8UUhl2d8AhdHkQKBgF6jwGipQx9W1ykl5RHnIBHwHCfCUKIkeqhuO2ZwimHXrzaiffdm/8LAZwaMqXiWaJA59FH/6+L11JPIlubki8tKvjPMtQSqZMGKLVYWU21BVh02gGo2Mo8wxlDlUqjRbj/0HB9yX4j0BSzpuGClabMCbj//k92cWzCNy1MngBNvAoGBAKh5rr0cbC6nKOC8o5VNwzXIaZFEeW43GH/vpzHXdeTIvg9OXBYQ04rSiDBQbssvrLdo9WIIh4fpwTYPDP2cIdOs/GFiZci7Uv/hfiaaj2R+ZYoIxs0upwz8+opIKZAWfdRVPifYOe+tMd72mSwaP4q9KZ3ennLII0OPg/hD6UQ3",
// 				"json",
// 				"UTF-8", 
// 				"MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCaHa5NvmIg2IvB/bl50R3Z+q10HhWxRbu5hlSqH/9/P6CEwJC2BHAQ4oQCLN4JjSW/RCS4lwpAVVEVUTLWbGa9X0A1HdCAWMOfY1NjlHSYJE41arB3pkE1ezk8HeXQyS5uKmXzhihbkbbUsRwF3dsy2OOUyO3UnVZLd8v1HUbKxEggQYH54SPnk7KX8Z4rlcwXrUytCLTdA6W/Mpu9W/GofW9JS1ld+PAVwueIz9+UY3IZuPhCms3+NTcjUy7OosNRTz9oo1zb3dxqyjZGB4jTWP1FPXcO1PHDPScYzDA8mlMmb/dGpLiH8O0n/j/RJ8N+JyX5v7H82WTOEMFMwOQFAgMBAAECggEAQqpGJNEO54BkbCTR33Tqwcji0RDWd1lfy+/knba7sZKXX/VgY6vlwhgJ3FsGLQGGa4cRj1uejpeZPGxkXkaD5rTWNGPSNkKvVDoF71RfXxSNVCPzc75SBM1pw6x3JepwkCz87uuAd6O/f5+hLJR8ZjFVuJ1163unwXtvmXbxkXHH/sUejf+tFlaR5ZDLFeWYHkAdQGimDqUhMfT29B5mavhJ0kt7RJI+qVkLTXcemQeu9nYGgva3F1aDiuKmLoDhv0mJweRSIah2ElHq+XSSXqDvRZJuECa9thee9tw6JIrnQEjVv3vsd+fzHc4Y+fUcOJPBXG0wMOwvgNq1DbfCHQKBgQD6Vqt+EhlIfAT+tNYjL4eGKG9IQYviO+f6Vsviofs72zdZvtapZ+tn1i7Bvwy059ZedUe8MVTwyoQaEkUkFn+2PQGtLywrJq/OcafQ7gnuyCeglRg/ezC2AE0NRVpfNFDy6XMHVzlfrBco16LtnygZO61mweiSBZM57gd6bYTVTwKBgQCdme6bzZKaykeDw3DddCuxmq4v57NFcmt0Jo9VSQXTCeNGxx5e4vnqku5YbOsET9yNbsZ9bcuaMlTzjPwm+UWbmA/CJPdTLJmrzoeM9x4fFdiIKhWP1Wk2b2L07s3/cPA4vO22PN27/rZ+ifol4hRqQ8ax17UzlCdzmtXLwhGEawKBgQDaCNKkoy7SKvJOxUIcszDecCk8TZqAGJ0bNK2vXlVq9KtoxwY/1fr6HVnr9XIjvii/bHZmOrE4Z6pW6sK9g7sIBmqHZCacDr3gmK0JE8oi5sFc436TC8CJRAnYHSdw9Cfs6db99cJKyaACOo31WEGceJW2gf0F8UUhl2d8AhdHkQKBgF6jwGipQx9W1ykl5RHnIBHwHCfCUKIkeqhuO2ZwimHXrzaiffdm/8LAZwaMqXiWaJA59FH/6+L11JPIlubki8tKvjPMtQSqZMGKLVYWU21BVh02gGo2Mo8wxlDlUqjRbj/0HB9yX4j0BSzpuGClabMCbj//k92cWzCNy1MngBNvAoGBAKh5rr0cbC6nKOC8o5VNwzXIaZFEeW43GH/vpzHXdeTIvg9OXBYQ04rSiDBQbssvrLdo9WIIh4fpwTYPDP2cIdOs/GFiZci7Uv/hfiaaj2R+ZYoIxs0upwz8+opIKZAWfdRVPifYOe+tMd72mSwaP4q9KZ3ennLII0OPg/hD6UQ3", 
// 				"RSA2");
 		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
 		AlipayTradeAppPayRequest aliRequest = new AlipayTradeAppPayRequest();
 		//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为stack的model入参方式(model和biz_content同时存在的情况下取biz_content)。
 		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
 		model.setBody("物业缴费测试数据1");
 		model.setSubject("物业缴费测试1");
 		model.setOutTradeNo(outTradeNo);
 		model.setTimeoutExpress("30m");
 		model.setTotalAmount(totalAmount);
 		model.setProductCode("QUICK_MSECURITY_PAY");
 		aliRequest.setBizModel(model);
 		aliRequest.setNotifyUrl("http://106.74.146.162:9080/cmcc/alipay/notifyUrl/notify");
 		System.out.println("1");
		try {
			// 这里和普通的接口调用不同，使用的是sdkExecute
			AlipayTradeAppPayResponse aliResponse = aliPayService.alipayClient.sdkExecute(aliRequest);
			if (aliResponse.isSuccess()) {
				System.out.println("调用成功");
				jsonRes.put("body", aliResponse.getBody());
				//System.out.println(aliResponse.getBody());// 就是orderString
				jsonRes.put("status", "1");
		 		jsonRes.put("msg", "操作成功！");
			} else {
				System.out.println("调用失败");
				jsonRes.put("status", "0");
		 		jsonRes.put("msg", "操作失败！");
			}
		} catch (AlipayApiException e) {
 		    e.printStackTrace();
 		    System.out.println("ERRO");
			jsonRes.put("status", "0");
	 		jsonRes.put("msg", "ERRO！");
 		}
 		
 		//JSONObject jsondata=JSONObject.parseObject(jsonRes.toString());
 		System.out.println("调用返回值{}"+jsonRes);
 		return  jsonRes;
 	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String aa="alipay_sdk=alipay-sdk-java-3.7.26.ALL&app_id=2019042364309223&biz_content=%7B%22body%22%3A%22%E7%89%A9%E4%B8%9A%E7%BC%B4%E8%B4%B9%E6%B5%8B%E8%AF%95%E6%95%B0%E6%8D%AE1%22%2C%22out_trade_no%22%3A%22201919001%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22%E7%89%A9%E4%B8%9A%E7%BC%B4%E8%B4%B9%E6%B5%8B%E8%AF%951%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.1%22%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay&notify_url=http%3A%2F%2F106.74.146.162%3A9080%2Fcmcc%2Falipay%2FnotifyUrl%2FzfbPay&sign=MQRIJuOBRR3YaQQuqY2waHOwJJeS9O%2F8mI6J6XY8HQZSGTNqg96NYv1JXqacCrLx3GbSckiIIfOlui5NuSskXUS3JGzFz1zFFN2oK%2ByOnB%2FRI3KhJLoN%2BxA6dtevL3Qcvxw88Qt4dYlVA2jpilj0AVpKTtFKYbtcy2rb7HM5wrFIDXyPdLYquS%2FhzFTup19Rs84Lpzo0%2BiZaJNkR8kgNUBFqAQhmd9fnK1IHdi%2F%2B0WIWO%2BHuszjDpkFuejbvHZtcdN75MDURnAfOivodnBtU3pI%2FGgyDFmoEtlZqWaL2OZujwCjKBCMVQwl90OfGRt7du0%2FvJPMeZrfhjYNB%2FiAZuA%3D%3D&sign_type=RSA2&timestamp=2019-04-29+17%3A05%3A07&version=1.0";
	
	//System.out.println("{}"+URLDecoder.decode(aa, "utf-8"));
		ReturnObject ret = new ReturnObject();
 		ret.setResponse("1234567890-=");
 		System.out.println(ret.toString());
 		
 		
	}
}
