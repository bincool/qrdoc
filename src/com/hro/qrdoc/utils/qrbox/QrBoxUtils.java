/**
* @FileName: QrBoxUtils.java
* @Package: com.hro.qrdoc.utils.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxUtils.java: ��ά��װ��ɨ�蹤����.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����5:40:10.
* @Content: ����.
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
* ��ά��װ��ɨ�蹤����.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����5:40:10.
* 
*/
public class QrBoxUtils 
{
	
	public static String verifyQrBoxPageParams(QrcodeBoxBean qrcodeBoxBean) 
	{
		
		// У��ÿ�����.
		if (StringUtils.isEmpty(qrcodeBoxBean.getCount())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_COUNT;
		}
		
		// У�鶩�����.
		if (StringUtils.isEmpty(qrcodeBoxBean.getOrderNum())) 
		{
			
			return SysStatusAndType.QBPParamsVerify.ERR_ORDERNUM;
		}
		
		// У���������.
		if (StringUtils.isEmpty(qrcodeBoxBean.getBigBoxCode())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_BIGBOXCODE;
		}
		
		// У��װ���ά��.
		if (StringUtils.isEmpty(qrcodeBoxBean.getQrCodeText())) 
		{
			return SysStatusAndType.QBPParamsVerify.ERR_QRCODETEXT;
		}
		
		return SysStatusAndType.QBPParamsVerify.OK;
	}
	
	
	
}
