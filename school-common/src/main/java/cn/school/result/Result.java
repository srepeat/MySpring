package cn.school.result;

/**
 * 封装一个结果集
 * @author 鲜磊
 *
 */
public class Result {
	
	private boolean success;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(boolean success) {
		super();
		this.success = success;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
