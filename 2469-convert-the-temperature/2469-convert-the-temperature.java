class Solution {
    public double[] convertTemperature(double celsius) {
        
        
        double ans[] =new double[2];
        double kelvin=celsius+273.15;
        double fahrenheit=celsius*1.80+32.00;
        ans[0]=Double.valueOf(String.format("%.5f",kelvin));
        ans[1]=Double.valueOf(String.format("%.5f",fahrenheit));
        
        return ans;
    }
}