/**
* @FileName: ApplicationConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConstant.java: ���±�����-������.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����16:38:40.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.constant;

import java.util.Map;

import com.hro.qrdoc.utils.ApplicationConfigHelper;

/**
* @ClassName: ApplicationConstant.java
* 
* @Description: 
* <p>
* ���±�����-����application.properties�������䳣������ֵ.
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
* @Date: 2018��1��31�� ����16:38:40.
* 
*/
public interface ApplicationConstant 
{
	
	/**
	 * Ӧ������.
	 */
	Map<String, String> APP_CONFIGS = ApplicationConfigHelper.getInstance().getPropMap();
	
	/**
	 * Frame����.
	 */
	String FRAME_TITLE = APP_CONFIGS.get("frame.title");
	
	/**
	 * Frameͼ��·��.
	 */
	String FRAME_ICON_PATH = APP_CONFIGS.get("frame.icon.path");
	
	/**
	 * ȡ����ʾͼ��·��.
	 */
	String FRAME_CANCEL_SHOW_PATH = APP_CONFIGS.get("frame.cancel.show.path");
	
	/**
	 * ȡ������ͼ��·��.
	 */
	String FRAME_CANCEL_HIDE_PATH = APP_CONFIGS.get("frame.cancel.hide.path");
	
}
