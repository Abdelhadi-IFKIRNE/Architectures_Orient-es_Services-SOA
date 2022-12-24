package org.example.service;

public class securityContext {
  private static String username;
  private static String password;
  private static String[] roles={};

  public static void authenticate(String u,String p, String[] rls){
      if(u=="abdelhadi" && p=="123"){
          username=u;
          password=p;
          roles=rls;
      }else {
          throw new RuntimeException("Unauthorized.....");
      }
  }

  public static boolean hasRole(String r){
      for (String s:roles) {
        if(s.equals(r))
            return true;
      }
      return false;
  }
}
