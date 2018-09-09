final class abc{
void display(){
System.out.println("This class cannot be extended further");
}
}
class notextend {
public static void main(String args[]){
abc obj=new abc();
obj.display();
}
}