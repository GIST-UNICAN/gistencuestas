package gist.unican.com.encuestaapp.domain.model;

import java.util.List;

/**
 * Created by andres on 16/05/2017.
 */

public class SurveyGeneralVariablesObjectCard {
    private String titulo;
    private Boolean radiosEnabled;
    private int numeroRadios;
    private List<List<String>> listaRadioButtons;
    private String variableSpinner;
    private Boolean spinner;
    private List<String> listaSpinner;
    private List<Boolean> activeRadios;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getRadiosEnabled() {
        return radiosEnabled;
    }

    public void setRadiosEnabled(Boolean radiosEnabled) {
        this.radiosEnabled = radiosEnabled;
    }

    public int getNumeroRadios() {
        return numeroRadios;
    }

    public void setNumeroRadios(int numeroRadios) {
        this.numeroRadios = numeroRadios;
    }

    public List<List<String>> getListaRadioButtons() {
        return listaRadioButtons;
    }

    public void setListaRadioButtons(List<List<String>> listaRadioButtons) {
        this.listaRadioButtons = listaRadioButtons;
    }

    public String getVariableSpinner() {
        return variableSpinner;
    }

    public void setVariableSpinner(String variableSpinner) {
        this.variableSpinner = variableSpinner;
    }

    public Boolean getSpinner() {
        return spinner;
    }

    public void setSpinner(Boolean spinner) {
        this.spinner = spinner;
    }

    public List<String> getListaSpinner() {
        return listaSpinner;
    }

    public void setListaSpinner(List<String> listaSpinner) {
        this.listaSpinner = listaSpinner;
    }

    public List<Boolean> getActiveRadios() {
        return activeRadios;
    }

    public void setActiveRadios(List<Boolean> activeRadios) {
        this.activeRadios = activeRadios;
    }

    public SurveyGeneralVariablesObjectCard(String titulo, Boolean radiosEnabled, int numeroRadios, List<List<String>> listaRadioButtons, String variableSpinner, Boolean spinner, List<String> listaSpinner, List<Boolean> activeRadios) {

        this.titulo = titulo;
        this.radiosEnabled = radiosEnabled;
        this.numeroRadios = numeroRadios;
        this.listaRadioButtons = listaRadioButtons;
        this.variableSpinner = variableSpinner;
        this.spinner = spinner;
        this.listaSpinner = listaSpinner;
        this.activeRadios = activeRadios;
    }
}
