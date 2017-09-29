package lesson4.network;

import java.util.ArrayList;

public class Network {
    public class Member {
        final private String name;
        public ArrayList<Member> friends;

         Member(String name){
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void leave(){
             unenroll(this);
        }
        public boolean belongsTo(Network n){
            return n == Network.this;
        }
    }
    //Network용-------------------------------------------------------------------------------
    private ArrayList<Member> members = new ArrayList<>();
    public Member enroll(String name){
        //this == new Network() == net1 == newMember.outer
        Member newMember = this.new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void unenroll(Member member){
        members.remove(member);
    }

}