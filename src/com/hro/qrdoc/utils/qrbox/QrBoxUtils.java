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

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = LogManager.getLogger(QrBoxUtils.class);
	
	/**
	 * 校验参数.
	 * @param qrcodeBoxBean
	 * @return
	 */
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
	
	/**
	 * 保存数据.
	 * @param srcPathname
	 * 		文件存放路径.
	 * @param qrcodeBoxBean
	 * 		写入文件的内容实体.
	 * @throws IOException
	 */
	public static void saveData(String srcPathname, QrcodeBoxBean qrcodeBoxBean) throws IOException
	{
		String context = "";
		
		// 记录订单号.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_ORDERNUM + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getOrderNum() + ApplicationConstant.LINE_SEPARATOR;
		
		// 记录大箱码.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_BIGBOXCODE + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getBigBoxCode() + ApplicationConstant.LINE_SEPARATOR;
		
		// 记录二维码数据.
		context += ApplicationConstant.QRDOC_FILE_REGEX_KEY_QRCODETEXT + ApplicationConstant.LINE_SEPARATOR;
		context += qrcodeBoxBean.getQrCodeText() + ApplicationConstant.LINE_SEPARATOR;
		
		// 写入文件.
		LOGGER.info(context);
		FileHelper.writeStringToFile(srcPathname, context, true);
	}
	
	/**
	 * 合并子文件并删除子文件.
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
     * 去除字符串中头部和尾部所包含的空格（包括:空格(全角，半角)、制表符、换页符等）
     * @param s
     * @return
     */
    public static String trim(String str) 
    {
        String result = "";
        if(StringUtils.isNotEmpty(str)) 
        {
            result = str.replaceAll("^[　*| *| *|//s*]*", "").replaceAll("[　*| *| *|//s*]*$", "");
        }
        return result;
    }
	
}
