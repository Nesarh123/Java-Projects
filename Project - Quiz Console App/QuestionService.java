import java.util.Scanner;

public class QuestionService 
{
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "Who is the founder of Microsoft?", "Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Larry Page", "Bill Gates");
        questions[1] = new Question(2, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[2] = new Question(3, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[3] = new Question(4, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
        questions[4] = new Question(5, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
    }

    public void PlayQuiz()
    {
        int j = 0;

        Scanner sc = new Scanner(System.in);

        for (Question q : questions)
        {
            System.out.println("Question.no: " + q.getId());
            System.out.println(q.getQuestion());
            for (int i = 1; i <= 4; i++)
            {
                System.out.println(i + ". " + q.getOpt(i));
            }

            System.out.print("Your answer: ");
            selection[j] = sc.nextLine();
            j++;
            System.out.println();
        }

        for (String ans : selection)
        {
            System.out.println("Selected Answer: " + ans);
        }

        System.out.println();
        for (Question q : questions)
        {
            System.out.println("Correct Answer: " + q.getAnswer());
        }
        sc.close();
    }

    public void getScore()
    {
         int score = 0;
        for(int i = 0; i < questions.length; i++)
        {
            String correctAnswer = questions[i].getAnswer();
            String userAnswer = selection[i];
            if(correctAnswer.equals(userAnswer))
                score++;
        }
        System.out.println("Your total score is: " + score + " out of " + questions.length);
    }
}

