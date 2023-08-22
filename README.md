# Java_Voting_System
For beginner students. OOP, ArrayList, Inheritance,Abstract class
// There is more than one party to participate in the election and citizens will vote for one of these parties (it is
assumed that citizens do not cast a blank vote).
// Voting is not mandatory.
// Each party has name, party ID and total number of votes. Initially, the number of votes of all parties is 0.
Citizens will vote using the ID of the party they want to vote for.
// Each citizen has name, age and information about whether they vote or not.
// There are two types of citizens who will vote: Turkish citizens and foreign citizens. Citizens must meet
certain conditions for their votes to be valid. These requirements are different for the two groups of citizens.
The conditions for Turkish citizens are as follows:
// Citizens should be asked for their identification number (ID) while voting. This ID number must consist of 11
characters and must be all digits. Must be over 18 years old and must not have voted before. If all of these
conditions are met, the vote will be valid.
// The conditions for foreign citizens are as follows:
// In addition to the requirements of Turkish citizens, the passport number should be asked to the citizens and
the passport number should consist of 7 characters (must consist of 1 letter and 6 digit). Again, if all of these
conditions are met, the vote will be valid.
The voting process is managed as follows:
//1. Citizens vote using the ID of the party they want to vote for.
//2. At this stage, it is checked whether the voting citizen fulfills the conditions, taking into account the type of
citizenship. If all conditions are met, the vote is considered valid.
//3. In case the vote is considered valid, the number of votes of the party whose party ID is given is increased by
one and the voted information of the citizen is updated.
//4. If the vote is not considered valid, no action is taken, the vote is wasted.
