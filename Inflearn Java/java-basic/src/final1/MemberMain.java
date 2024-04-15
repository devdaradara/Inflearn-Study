package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "ryu");
        member.print();
        member.changeData("myId2", "jiye");
        member.print();
    }
}
