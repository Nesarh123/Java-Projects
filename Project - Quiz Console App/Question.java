public class Question 
{
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) 
    {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getQuestion() 
    {
        return question;
    }

    public void setQuestion(String question) 
    {
        this.question = question;
    }

    public String getOpt(int index) 
    {
        switch (index) 
        {
            case 1: return opt1;
            case 2: return opt2;
            case 3: return opt3;
            case 4: return opt4;
            default: return null;
        }
    }

    public String setOpt(int index, String option) 
    {
        switch (index) 
        {
            case 1: this.opt1 = option; break;
            case 2: this.opt2 = option; break;
            case 3: this.opt3 = option; break;
            case 4: this.opt4 = option; break;
        }
        return option;
    }

    public String getAnswer() 
    {
        return answer;
    }
    
    public void setAnswer(String answer) 
    {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", opt4=" + opt4 + ", answer=" + answer + "]";
    }

    

    
}
