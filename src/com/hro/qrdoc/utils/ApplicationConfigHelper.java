/**
* @FileName: ApplicationConfigHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConfigHelper.java: Ӧ�����ð�����.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����16:38:40.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;

/**
 * @ClassName: ApplicationConfigHelper.java
 * 
 * @Description:
 * <p>
 * ��ȡproperties�����ļ�.
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
public class ApplicationConfigHelper 
{
	
	/**
	 * �����ļ�·��.
	 */
	private static final String configFilePath = "configs\\application.properties";

	/**
	 * ��������.
	 */
	private static ApplicationConfigHelper instance = null;

	/**
	 * ����map���漯��.
	 */
	private static Map<String, String> propMap = new HashMap<String, String>();

	/**
	 * ˽�й��캯��.
	 */
	private ApplicationConfigHelper() 
	{
		File file = new File(configFilePath);

		InputStream is = null;
		
		InputStreamReader isr = null;

		Properties pro = new Properties();

		try 
		{

			is = new FileInputStream(file);
			
			isr = new InputStreamReader(is, "UTF-8");

			pro.load(isr);

			Enumeration<?> e = pro.propertyNames();

			while (e.hasMoreElements()) 
			{

				String key = (String) e.nextElement();

				String value = (String) pro.get(key);

				propMap.put(key, value);

			}

		} 
		catch (IOException e) 
		{

			e.printStackTrace();

		} 
		finally 
		{
			IOUtils.closeQuietly(isr);
			IOUtils.closeQuietly(is);
		}
	}

	/**
	 * ��ȡ��������.
	 * @return
	 */
	public static ApplicationConfigHelper getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApplicationConfigHelper();
		}

		return instance;
	}

	/**
	 * ��ȡ����map���漯��.
	 * @return
	 */
	public Map<String, String> getPropMap() 
	{
		return propMap;
	}

}
