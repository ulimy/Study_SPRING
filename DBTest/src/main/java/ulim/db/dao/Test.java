package ulim.db.dao;

public class Test {
	private String memberId , memberPW;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	@Override
	public String toString() {
		return "Test [memberId=" + memberId + ", memberPW=" + memberPW + "]";
	}
	
	
}
