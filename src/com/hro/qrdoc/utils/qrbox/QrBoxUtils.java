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

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;

import com.hro.qrdoc.bean.qrbox.QrBoxPage;
import com.hro.qrdoc.bean.qrbox.QrcodeBoxBean;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.constant.SysStatusAndType;

import io.github.bincool.utils.FileHelper;
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
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(QrBoxUtils.class);
	
	/**
	 * У�����.
	 * @param qrcodeBoxBean
	 * @return
	 */
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
	
	/**
	 * ��������.
	 * @param srcPathname
	 * 		�ļ����·��.
	 * @param qrcodeBoxBean
	 * 		д���ļ�������ʵ��.
	 * @throws IOException
	 */
	public static void saveData(String srcPathname, QrcodeBoxBean qrcodeBoxBean) throws IOException
	{
		String context = "";
		
		// ��¼������.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_ORDERNUM + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getOrderNum() + ApplicationConstant.LINE_SEPARATOR;
		
		// ��¼������.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_BIGBOXCODE + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getBigBoxCode() + ApplicationConstant.LINE_SEPARATOR;
		
		// ��¼��ά������.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_QRCODETEXT + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getQrCodeText() + ApplicationConstant.LINE_SEPARATOR;
		
		// д���ļ�.
		LOGGER.info(context);
		FileHelper.writeStringToFile(srcPathname, context, true);
	}
	
	/**
	 * �ϲ����ļ���ɾ�����ļ�.
	 * @param qrBoxPage
	 * @throws IOException
	 */
	public static void mergeSubFile(QrBoxPage qrBoxPage) throws IOException 
	{
		String srcPathname = qrBoxPage.getFileName() + File.separator + "qr_" + qrBoxPage.getOrderNumPanel().getInputValue() + ".txt";
		for (Map.Entry<String, Integer> entry : qrBoxPage.getBoxDataBuffer().entrySet()) 
		{
			FileHelper.writeStringToFile(srcPathname, FileHelper.readFileToString(entry.getKey()), true);
			FileHelper.deleteFile(entry.getKey());
		}
		
		String context = ApplicationConstant.QRDOC_FILE_REGEX_KEY_ORDERNUM + ApplicationConstant.LINE_SEPARATOR;
		FileHelper.writeStringToFile(srcPathname, context, true);
	}
	
	/**
     * ȥ���ַ�����ͷ����β���������Ŀո񣨰���:�ո�(ȫ�ǣ����)���Ʊ������ҳ���ȣ�
     * @param s
     * @return
     */
    public static String trim(String str) 
    {
        String result = "";
        if(StringUtils.isNotEmpty(str)) 
        {
            result = str.replaceAll("^[��*| *| *|//s*]*", "").replaceAll("[��*| *| *|//s*]*$", "");
        }
        return result;
    }
	
}
