package TypeRestriction;

public class Avarage<T extends Number>{
    private T[] numbres;

    public Avarage(T[] numbres){
        this.numbres = numbres.clone();
    }

    public double avg(){
        double sum = 0.0;
        for(T num : numbres){
            sum += num.doubleValue();
        }
        return sum / numbres.length;
    }

    public boolean isSameAvg(Avarage<?> other){
        if(this.avg() == other.avg()){
            return true;
        }
        return false;
    }

    public Avarage clone(){
         return new Avarage(this.numbres);
    }
}
