package a2015年省赛;


/*
 * 
 */
public class _03三羊献瑞 {
    public static void main(String args[]) {
        int tt=0;
        int arr[]=new int[7];
        for(arr[0]=2;arr[0]<=9;arr[0]++) {    //祥
            for(arr[1]=0;arr[1]<=9;arr[1]++) {    //瑞
                if(arr[1]==1) {
                    continue;
                }
                for(arr[2]=0;arr[2]<=9;arr[2]++) {    //生
                    if(arr[2]==1) {
                        continue;
                    }
                    for(arr[3]=0;arr[3]<=9;arr[3]++) {    //辉
                        if(arr[3]==1) {
                            continue;
                        }
                        for(arr[4]=0;arr[4]<=9;arr[4]++) {    //羊
                            if(arr[4]==1) {
                                continue;
                            }
                            for(arr[5]=0;arr[5]<=9;arr[5]++) {    //献
                                if(arr[5]==1) {
                                    continue;
                                }
                                for(arr[6]=0;arr[6]<=9;arr[6]++) {    //气
                                    if(arr[6]==1) {
                                        continue;
                                    }
                                    int flag[]= {0,0,0,0,0,0,0,0,0,0};
                                    int i=0;
                                    int ff=0;
                                    for(i=0;i<=6;i++) {    //判断是否包含相同的数码
                                        if(flag[arr[i]]==1) {
                                            ff=1;
                                            break;
                                        }
                                        flag[arr[i]]=1;
                                    }
                                    if(ff==1) {    //有相同数码
                                        continue;
                                    }
                                    if((arr[0]*1000+arr[1]*100+arr[2]*10+arr[3])+(1000+arr[4]*100+arr[5]*10+arr[1])==10000+arr[4]*1000+arr[2]*100+arr[1]*10+arr[6]) {
                                        System.out.println(1000+arr[4]*100+arr[5]*10+arr[1]);
                                        tt=1;
                                    }
                                    if(tt==1) {
                                        break;
                                    }
                                }
                                if(tt==1) {
                                    break;
                                }
                            }
                            if(tt==1) {
                                break;
                            }
                        }
                        if(tt==1) {
                            break;
                        }
                    }
                    if(tt==1) {
                        break;
                    }
                }
                if(tt==1) {
                    break;
                }
            }
            if(tt==1) {
                break;
            }
        }
    }
}