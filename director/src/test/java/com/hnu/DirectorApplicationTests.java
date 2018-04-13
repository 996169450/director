package com.hnu;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DirectorApplicationTests {

	@Autowired
	private MockMvc mvc;
	/*
       1.根据会员号或手机号模糊查询业务总监基本信息
    */
	@Test
	public void queryInfo() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/queryinfo?username=85"))
				.andDo(print());// 打印结果到控制台  ;
		//.andExpect(MockMvcResultMatchers.content().string("365"));  //测试接口返回内容
	}

	/*
      3.根据会员号查姓名，手机号，身份证号
    */
	@Test
	public void queryBaseInfo() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/querybaseinfo?tjid=210002"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
      4.根据会员号或手机号模糊查询代理商基本信息
    */
	@Test
	public void queryAgentInfo() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/queryagentinfo?username=21000"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
       5.增加物流顾问
    */
	@Test
	public void addDirector() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/adddirector?tjid=123456&mobile=13164653665&agenttjid=777777&park=清华园"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
      6.批量删除物流顾问
    */
	@Test
	public void deleteDirector() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/deletedirector?tjids="))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
      7.修改物流顾问前的查询
    */
	@Test
	public void queryDirector() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/querydirector?tjid=210010"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
    8.修改物流顾问
     */
	@Test
	public void updateDirector() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/updatedirector?tjid=210010&mobile=111111111&agenttjid=11111&park=111"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
    9.重置密码
     */
	@Test
	public void resetPassword() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/resetpassword?tjid=210010"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
	 10.修改账户状态
	*/
	@Test
	public void lock() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/lock?tjid=210001&status=2"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
     11.点击查看成员按钮，查看分组接口
     */
	@Test
	public void queryGroup() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/querygroup?tjid=818571"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
    12.查询分组成员
     */
	@Test
	public void queryMember() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/querymember?groupid=65614e6c59ef465ca51c21d860e4a2c7&pageNum=1&pageSize=5"))
				.andDo(print());// 打印结果到控制台  ;
	}

	/*
    13.点击更多，查询厂商接口
     */
	@Test
	public void queryFactory() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/director/queryfactory?tjid=210001&pageNum=1&pageSize=3"))
				.andDo(print());// 打印结果到控制台  ;
	}
}
