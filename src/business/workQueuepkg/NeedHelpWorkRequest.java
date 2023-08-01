/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueuepkg;

import business.common.HelpNeeded;

/**
 *
 * @author ayush
 */
public class NeedHelpWorkRequest extends WorkRequest {
 
    
    private String requestId;
    private static int count = 000;
    private String comments;
    private HelpNeeded needHelp;
    private String requestResult;
   

    public NeedHelpWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("REQ");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setNeedHelp(HelpNeeded needHelp) {
        this.needHelp = needHelp;
    }

    public HelpNeeded getNeedHelp() {
        return needHelp;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }


    
    @Override
    public String toString() {
        return getNeedHelp().getHelp();
    }
    
    
    
    
}
