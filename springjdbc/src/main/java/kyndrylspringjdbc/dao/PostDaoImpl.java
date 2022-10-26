package kyndrylspringjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kyndrylspringjdbc.model.Post;
import kyndrylspringjdbc.model.PostRowMapper;

@Component("springjdbc")
public class PostDaoImpl implements PostDao{
	
	
	@Autowired
	public JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<Post> getPostsFromDatabase() {
		// TODO Auto-generated method stub
		String sql = "select * from Post";
		List<Post> persons = template.query(sql,new PostRowMapper());
		return persons;
	}


	@Override
	public String insertPost(Post post) {
		// TODO Auto-generated method stub
		String SQL = "insert into Post values (?,?,?,?)";
		template.update(SQL, post.getPid(),post.getAuthor(), post.getTitle(), 
				post.getDescription());
		return "record insered";
		
	}
	@Override
	public String deletePost(int pid) {
		// TODO Auto-generated method stub
		String sql = "delete from Post where pid=?";
		template.update(sql, pid);
		return "post deleted";
	}
}
