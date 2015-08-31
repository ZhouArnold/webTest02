package com.zll.biz;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zll.impl.IDoSqlImpl;

public class QueryList {
	IDoSqlImpl q = new IDoSqlImpl();
	ResultSet rs = null;
	public List doQuery(String sql,int pagecond) throws SQLException{
		rs = q.doQuery(sql,pagecond);
		return resultSetToList(rs);
	}
	public List resultSetToList(ResultSet rs) throws java.sql.SQLException {   
        if (rs == null)   
            return Collections.EMPTY_LIST;   
        ResultSetMetaData md = rs.getMetaData(); //得到结果集(rs)的结构信息，比如字段数、字段名等   
        int columnCount = md.getColumnCount(); //返回此 ResultSet 对象中的列数 
        //System.out.println(md.getColumnName(1));
        List list = new ArrayList();   
        Map rowData = new HashMap();   
        while (rs.next()) {   
         rowData = new HashMap(columnCount);   
         for (int i = 1; i <= columnCount; i++) {   
                 rowData.put(md.getColumnName(i), rs.getObject(i));   
         }   
         list.add(rowData);   
        // System.out.println("list:" + list.toString());   
        }   
        return list;   
}  
}
