package com.tesseract.decision_tree_analysis;

/**
 * Created by BlackFlag on 9/10/2016.
 */
public class Glass {

    private Double RI;
    private Double Na;
    private Double Mg;
    private Double Al;
    private Double Si;
    private Double K;
    private Double Ca;
    private Double Ba;
    private Double Fe;

    public Glass(Double RI, Double na, Double mg, Double al, Double si, Double k, Double ca, Double ba, Double fe) {
        this.RI = RI;
        Na = na;
        Mg = mg;
        Al = al;
        Si = si;
        K = k;
        Ca = ca;
        Ba = ba;
        Fe = fe;
    }


    public String getGlassResult()
    {

        if(Ba>.27)
        {
            if(Si>70.16) return AppUtil.headlamps;
            else return AppUtil.building_windows_non_float_processed;

        }
        else{

            if(Mg>2.41)
            {

                if(Al>1.41)
                {
                    if(Si>72.49){
                        if(RI>1.51732)
                        {
                            if(RI>1.51789) return AppUtil.building_windows_non_float_processed;
                            else return AppUtil.building_windows_float_processed;
                        }
                        else {
                            if(Fe>.22)
                            {
                                if(RI>1.51629)return AppUtil.building_windows_non_float_processed;
                                else return AppUtil.building_windows_float_processed;
                            }
                            else return AppUtil.building_windows_non_float_processed;
                        }
                    }
                    else
                    {
                        if(Ca>8.28) return AppUtil.vehicle_windows_float_processed;
                        else return AppUtil.building_windows_non_float_processed;
                    }
                }else {

                    if(RI>1.51707)
                    {
                        if(K>.23)
                        {
                            if(Mg>3.75) return AppUtil.building_windows_non_float_processed;
                            else {
                                if(Fe>0.14)
                                {
                                    if(Al>1.17) return AppUtil.building_windows_float_processed;
                                    else  return AppUtil.building_windows_non_float_processed;
                                }
                                else{
                                    if(RI>1.52043) return AppUtil.building_windows_non_float_processed;
                                    else return AppUtil.building_windows_float_processed;
                                }
                            }
                        }
                        else
                        {
                            if(Mg>3.34)
                            {
                                if(Si>72.64) return AppUtil.vehicle_windows_float_processed;
                                else {
                                    if(Na>14.01)
                                    {
                                        if(RI>1.52211) return AppUtil.building_windows_float_processed;
                                        else{
                                            if(Na>14.32) return AppUtil.building_windows_float_processed;
                                            else return AppUtil.vehicle_windows_float_processed;
                                        }
                                    }
                                    else
                                    {
                                        return AppUtil.building_windows_float_processed;
                                    }
                                }
                            }else {

                                return AppUtil.building_windows_non_float_processed;

                            }
                        }
                    }
                    else{

                        if(RI>1.51595)
                        {
                            if(Fe>0.12) return AppUtil.building_windows_non_float_processed;
                            else {
                                if(Mg>3.54)
                                {
                                    if(RI>1.51667) return AppUtil.vehicle_windows_float_processed;
                                    else return AppUtil.building_windows_non_float_processed;
                                }
                                else {

                                    return AppUtil.vehicle_windows_float_processed;

                                }
                            }
                        }
                        else {

                            return AppUtil.building_windows_float_processed;

                        }
                    }
                }
            }
            else{
                if(K>0.03)
                {
                    if(Na>13.49) return AppUtil.building_windows_non_float_processed;
                    else {
                        if(RI>1.5241) return AppUtil.building_windows_non_float_processed;
                        else return AppUtil.containers;
                    }
                }
                else{

                    if(Na>13.75) return AppUtil.tableware;
                    else return AppUtil.building_windows_non_float_processed;
                }
            }
        }

    }
    public Glass() {
    }

    public Double getRI() {
        return RI;
    }

    public void setRI(Double RI) {
        this.RI = RI;
    }

    public Double getNa() {
        return Na;
    }

    public void setNa(Double na) {
        Na = na;
    }

    public Double getMg() {
        return Mg;
    }

    public void setMg(Double mg) {
        Mg = mg;
    }

    public Double getAl() {
        return Al;
    }

    public void setAl(Double al) {
        Al = al;
    }

    public Double getSi() {
        return Si;
    }

    public void setSi(Double si) {
        Si = si;
    }

    public Double getK() {
        return K;
    }

    public void setK(Double k) {
        K = k;
    }

    public Double getCa() {
        return Ca;
    }

    public void setCa(Double ca) {
        Ca = ca;
    }

    public Double getBa() {
        return Ba;
    }

    public void setBa(Double ba) {
        Ba = ba;
    }

    public Double getFe() {
        return Fe;
    }

    public void setFe(Double fe) {
        Fe = fe;
    }
}
