package javamukesh;

class Teacher {
 void teach() {
  System.out.println("Teaching subject");
 }
}
class Student extends Teacher {
 void listen() {
  System.out.println("Listening");
 }
}
class homeTution extends Student {
 void explains() {
  System.out.println("Does homework");
 }
}
class CheckForInheritance {
 public static void main(String argu[]) {
  homeTution h = new homeTution();
  h.explains();
  h.teach();
  h.listen();
 }
}