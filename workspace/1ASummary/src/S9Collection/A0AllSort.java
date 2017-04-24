package S9Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A0AllSort {
	private static ArrayList<BasicClassCMP> students = new ArrayList<BasicClassCMP>();
//	调用默认排序
	public void sortElement1(){
		Collections.sort(students);
	}
//	comparator调用默认排序
	public void sortElement2(){
		Collections.sort(students, new Comparator<BasicClassCMP>(){

			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				
				return o1.compareTo(o2);
			}
		});
	}
	public void sortElement3(){
		Collections.sort(students, new Comparator<BasicClassCMP>(){

			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
	}
//	调用默认排序
	public void listSort1(){
		students.sort(new Comparator<BasicClassCMP>() {
			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				return o1.compareTo(o2);
			}
		});
	}
//	自定义排序
	public void listSort2(){
		students.sort(new Comparator<BasicClassCMP>() {
			@Override
			public int compare(BasicClassCMP o1, BasicClassCMP o2) {
				int rec = 0;
//				自定义排序
//				if(o1!=null&&o2!=null){
//					rec = 0;
//				}else if(o1!=null){
//					rec = -1;
//				}else if(o2!=null){
//					rec = 1;
//				}else{
//					rec = 0;
//					if(o1.size>o2.size){
//						rec = 1;
//					}else if (o1.size==o2.size){ 
//						if (!(o1.weigth==o2.weigth)){
//							rec = (o1.weigth-o2.weigth)>0?1:-1;
//						}
//					}else if (o1.size<o2.size) {
//						rec = -1;
//					}
//				}
				return rec;
			}
		});
	}
}
