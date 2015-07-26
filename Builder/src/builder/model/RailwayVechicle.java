/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.model;

/**
 *
 * @author artur
 */
public class RailwayVechicle {

    private Integer wheelsNum;
    private String codeName;
    private Integer selfWeight;

    public void ride() {
        System.out.println(codeName + " vechicle, wheels num: " + wheelsNum + " with self weight: " + selfWeight + " goes");
    }

    public Integer getWheelsNum() {
        return wheelsNum;
    }

    public void setWheelsNum(Integer wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Integer getSelfWeight() {
        return selfWeight;
    }

    public void setSelfWeight(Integer selfWeight) {
        this.selfWeight = selfWeight;
    }
}
