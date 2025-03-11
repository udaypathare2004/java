 class AccessSpecifier {
   static class Bankacc{
        public String  username;
        private String password;
    }

    public static void main(String args[]){
     Bankacc myacc = new  Bankacc();
     myacc.username = "udaypathare";
     myacc.password ="1234566";
     System.out.println(myacc.username);
     System.out.println(myacc.password);
    }
}