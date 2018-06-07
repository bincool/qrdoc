/**
* @FileName: ApplicationConfigHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConfigHelper.java: 应用配置帮助类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
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
 * 读取properties配置文件.
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
 * @Date: 2018年1月31日 上午16:38:40.
 * 
 */
public class ApplicationConfigHelper 
{
	
	/**
	 * 配置文件路径.
	 */
	private static final String configFilePath = "configs\\application.properties";

	/**
	 * 单例对象.
	 */
	private static ApplicationConfigHelper instance = null;

	/**
	 * 属性map缓存集合.
	 */
	private static Map<String, String> propMap = new HashMap<String, String>();

	/**
	 * 私有构造函数.
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
	 * 获取单例对象.
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
	 * 获取属性map缓存集合.
	 * @return
	 */
	public Map<String, String> getPropMap() 
	{
		return propMap;
	}

}
