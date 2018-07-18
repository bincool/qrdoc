/**
* @FileName: QrBoxUtils.java
* @Package: com.hro.qrdoc.utils.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxUtils.java: 二维码装箱扫描工具类.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午5:40:10.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.utils.qrbox;

import com.hro.qrdoc.bean.qrbox.QrcodeBoxBean;
import com.hro.qrdoc.constant.SysStatusAndType;

import io.github.bincool.utils.commons.StringUtils;

/**
* @ClassName: QrBoxUtils.java
* 
* @Description: 
* <p>
* 二维码装箱扫描工具类.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午5:40:10.
* 
*/
public class QrBoxUtils 
{
	
	public static String verifyQrBoxPageParams(QrcodeBoxBean qrcodeBoxBean) 
	{
		
		// 校验每箱个数.
		if (StringUtils.isEmpty(qrcodeBoxBean.getCount())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_COUNT;
		}
		
		// 校验订单编号.
		if (StringUtils.isEmpty(qrcodeBoxBean.getOrderNum())) 
		{
			
			return SysStatusAndType.QBPParamsVerify.ERR_ORDERNUM;
		}
		
		// 校验大箱条码.
		if (StringUtils.isEmpty(qrcodeBoxBean.getBigBoxCode())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_BIGBOXCODE;
		}
		
		// 校验装箱二维码.
		if (StringUtils.isEmpty(qrcodeBoxBean.getQrCodeText())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_QRCODETEXT;
		}
		
		return SysStatusAndType.QBPParamsVerify.OK;
	}
	
	
	
}
