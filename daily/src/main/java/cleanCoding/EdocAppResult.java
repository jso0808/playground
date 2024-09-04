package cleanCoding;


public class EdocAppResult {

	public static void main(String[] args) {
		try {
			boolean b = true;
			String[] result = {"1", "-1", "0"};
			String[] rName = {"이지은", "김과장", "최부장"};
			
			while(b) {
				
				
			}	
				/*
				for(int i=0; i<rr.length; i++) {
					if(rs.getString("resultList").contains("-1")) {
						edocdto.setResult((Arrays.asList(rr).indexOf("-1")+1)+"차반려");
						edocdto.setResult_name(aa[Arrays.asList(rr).indexOf("-1")]);
					} else {
						if(! rs.getString("resultList").contains("0")) {
							edocdto.setResult("승인");
							edocdto.setResult_name(aa[rr.length-1]); 
						}
						else {
							edocdto.setResult((Arrays.asList(rr).indexOf("0")+1)+"차대기");
							edocdto.setResult_name(aa[Arrays.asList(rr).indexOf("0")]);
						}
					}
				}
				*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
