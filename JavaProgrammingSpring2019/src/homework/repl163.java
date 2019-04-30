package homework;

public class repl163 {

	public static void main(String[] args) {
		

	}
	public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
	    if(notEmpty==true && taskId==currentId+1 ){
	      return true;
	    }else if(notEmpty==true && taskId > currentId+1){
	      return false;
	    }else if(notEmpty==false && taskId==currentId+1){
	      return false;
	    }
		return notEmpty;
	  }
}
