package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is: " + currentTime);
        String access="eyJhbGciOiJSUzI1NiIsIng1dSI6Imltc19uYTEta2V5LWF0LTEuY2VyIiwia2lkIjoiaW1zX25hMS1rZXktYXQtMSIsIml0dCI6ImF0In0.eyJpZCI6IjE2OTM5NTMxOTQ4NDRfZDdmNTQwMmYtMzQ0OC00OTkxLTgwYWUtMjUxYzM0NDc5OTNhX3V3MiIsInR5cGUiOiJhY2Nlc3NfdG9rZW4iLCJjbGllbnRfaWQiOiJTdW5icmVha1dlYlVJMSIsInVzZXJfaWQiOiI3NTM2MzRGRTYxNkE1OTkwMEE0OTVFOTJAQWRvYmVJRCIsInN0YXRlIjoie1wianNsaWJ2ZXJcIjpcInYyLXYwLjMxLjAtMi1nMWU4YThhOFwiLFwibm9uY2VcIjpcIjI1NjQwMzAzMDA0MjMxMDFcIn0iLCJhcyI6Imltcy1uYTEiLCJhYV9pZCI6Ijc1MzYzNEZFNjE2QTU5OTAwQTQ5NUU5MkBBZG9iZUlEIiwiY3RwIjowLCJmZyI6IlhZRkVQVENGVlBQNU1IVUtHTVFWWVBBQVNVIiwic2lkIjoiMTY5Mzk1MzE5NDgzOV80YWQ0YjZiNC03YWY3LTQ2YjMtYTNiNi03MzYxNmZjODg4ZWZfdXcyIiwibW9pIjoiZmIzNWRhMDciLCJwYmEiOiJNZWRTZWNOb0VWLExvd1NlYyIsImV4cGlyZXNfaW4iOiI2MDAwMDAiLCJjcmVhdGVkX2F0IjoiMTY5Mzk1MzE5NDg0NCIsInNjb3BlIjoiQWRvYmVJRCxvcGVuaWQsYWNjdF9tZ210X2FwaSxnbmF2LHJlYWRfY291bnRyaWVzX3JlZ2lvbnMsc29jaWFsLmxpbmssdW5saW5rX3NvY2lhbF9hY2NvdW50LGFkZGl0aW9uYWxfaW5mby5hZGRyZXNzLm1haWxfdG8sY2xpZW50LnNjb3Blcy5yZWFkLHB1Ymxpc2hlci5yZWFkLGFkZGl0aW9uYWxfaW5mby5hY2NvdW50X3R5cGUsYWRkaXRpb25hbF9pbmZvLnJvbGVzLGFkZGl0aW9uYWxfaW5mby5zb2NpYWwsYWRkaXRpb25hbF9pbmZvLnNjcmVlbl9uYW1lLGFkZGl0aW9uYWxfaW5mby5vcHRpb25hbEFncmVlbWVudHMsYWRkaXRpb25hbF9pbmZvLnNlY29uZGFyeV9lbWFpbCxhZGRpdGlvbmFsX2luZm8uc2Vjb25kYXJ5X2VtYWlsX3ZlcmlmaWVkLGFkZGl0aW9uYWxfaW5mby5waG9uZXRpY19uYW1lLGFkZGl0aW9uYWxfaW5mby5kb2IsdXBkYXRlX3Byb2ZpbGUuYWxsLHNlY3VyaXR5X3Byb2ZpbGUucmVhZCxzZWN1cml0eV9wcm9maWxlLnVwZGF0ZSxhZG1pbl9tYW5hZ2VfdXNlcl9jb25zZW50LGFkbWluX3NsbyxwaWlwX3dyaXRlLG1wcyxsYXN0X3Bhc3N3b3JkX3VwZGF0ZSx1cGRhdGVfZW1haWwscGFzc2tleV9yZWFkLHBhc3NrZXlfd3JpdGUsYWNjb3VudF9jbHVzdGVyLnJlYWQsYWNjb3VudF9jbHVzdGVyLnVwZGF0ZSxhZGRpdGlvbmFsX2luZm8uYXV0aGVudGljYXRpbmdBY2NvdW50LHJlYXV0aGVudGljYXRlZCJ9.HeAwgnIxOKJ3I2d6RVVJdwi-HFNBY51zt4h3fozJgBwFSMwjyMEWTGNcb5g22Ggi8JP8p1TbCTKINBbgYM6f_Qx4dw4kZVIAZN1sPYUK60JEStekZfeOvTm9H0pfaMuKK9RI34qXkhHJjYooJQdmJ3KYpLMf65W4QMC_qNzRibOfhp2CQcn5tEfu--MuhXILmBj4ohHoStJAsgo14qy3ofhHoSMgZ5SY3GvoLrkIFx96ftZ8lvyOGAwp8K5t1eLfxr_WbUjfwVko1yV-6Bs9-cHHBsrzIdM2A2iDj3acmP1qeJ2M3nK7P8JnM4G8aPuSJRyd0FCDVnIJfmlyYbcgJQ"

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
