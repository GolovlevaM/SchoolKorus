import data.Member;
import data.MembersGroup;
import org.junit.Assert;
import org.junit.Test;
import service.Finder;

import java.util.*;

public class FinderTest {
     private Finder finder = new Finder();

@Test
public void setFinder(){
     List<MembersGroup> membersGroups = new ArrayList<>();
     membersGroups.add(new MembersGroup("TeenAgers",
             Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                     new Member("Kate", 18))));
     membersGroups.add(new MembersGroup("Students",
             Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                     new Member("Kate", 26))));

     membersGroups.add(new MembersGroup("Adults",
             Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                     new Member("Kate", 55), new Member("Dilan", 50))));
     membersGroups.add(new MembersGroup("Smokie",
             Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                     new Member("Kate", 11))));
     membersGroups.add(new MembersGroup("Man",
             Arrays.asList(new Member("Bob", 45),
                     new Member("Stan", 30), new Member("Ken", 66))));

     Set<String> result = new HashSet<>();
     result.add("TeenAgers");
     result.add("Students");
     result.add("Adults");
     result.add("Smokie");
     result.add("Man");

     Set<String> set = finder.findOldMembers(membersGroups, 10);

     Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

}

     @Test
     public void setFinder1(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Students");
          result.add("Adults");
          result.add("Man");

          Set<String> set = finder.findOldMembers(membersGroups, 20);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }

     @Test
     public void setFinder2(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Students");
          result.add("Adults");
          result.add("Man");

          Set<String> set = finder.findOldMembers(membersGroups, 16);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }

     @Test
     public void setFinder3(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Adults");

          Set<String> set = finder.findOldMembers(membersGroups, 30);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }

     @Test
     public void setFinder4(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Adults");
          result.add("Man");

          Set<String> set = finder.findOldMembers(membersGroups, 29);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }

     @Test
     public void setFinder5(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("TeenAgers");
          result.add("Students");
          result.add("Adults");
          result.add("Smokie");
          result.add("Man");

          Set<String> set = finder.findOneMemberOlderTarget(membersGroups, 10);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }
     @Test
     public void setFinder6(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Adults");
          result.add("Man");

          Set<String> set = finder.findOneMemberOlderTarget(membersGroups, 49);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }

     @Test
     public void setFinder7(){
          List<MembersGroup> membersGroups = new ArrayList<>();
          membersGroups.add(new MembersGroup("TeenAgers",
                  Arrays.asList(new Member("Bob", 11), new Member("Alice", 16),
                          new Member("Kate", 18))));
          membersGroups.add(new MembersGroup("Students",
                  Arrays.asList(new Member("Bob", 23), new Member("Alice", 24),
                          new Member("Kate", 26))));

          membersGroups.add(new MembersGroup("Adults",
                  Arrays.asList(new Member("Bob", 33), new Member("Alice", 44),
                          new Member("Kate", 55), new Member("Dilan", 50))));
          membersGroups.add(new MembersGroup("Smokie",
                  Arrays.asList(new Member("Bob", 34), new Member("Alice", 34),
                          new Member("Kate", 11))));
          membersGroups.add(new MembersGroup("Man",
                  Arrays.asList(new Member("Bob", 45),
                          new Member("Stan", 30), new Member("Ken", 66))));

          Set<String> result = new HashSet<>();
          result.add("Adults");
          result.add("Smokie");
          result.add("Man");

          Set<String> set = finder.findOneMemberOlderTarget(membersGroups, 28);

          Assert.assertTrue(result.containsAll(set)&&set.containsAll(result));

     }



}
