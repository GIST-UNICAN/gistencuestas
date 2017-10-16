package gist.unican.com.gistapp.domain.model;

import android.support.annotation.Nullable;

import com.siimkinks.sqlitemagic.annotation.Column;
import com.siimkinks.sqlitemagic.annotation.IgnoreColumn;
import com.siimkinks.sqlitemagic.annotation.Table;

import java.util.List;

/**
 * Created by andres on 16/05/2017.
 */
@Table(persistAll = true)
public class SurveyVariablesObjectCard {
    @Column(useAccessMethods = true)
    @Nullable
    private String titulo;
    @Column(useAccessMethods = true)
    @Nullable
    private Boolean radiosEnabled;
    @Column(useAccessMethods = true)
    @Nullable
    private int numeroRadios;
    @Nullable
    @IgnoreColumn
    //@Column(useAccessMethods = true)
    private List<List<String>> listaRadioButtons;
    @Column(useAccessMethods = true)
    @Nullable
    private String variableSpinner;
    @Column(useAccessMethods = true)
    @Nullable
    private Boolean spinner;
    @IgnoreColumn
    @Nullable
    private List<String> listaSpinner;
    @IgnoreColumn
    @Nullable
    private List<Boolean> activeRadios;
    @Nullable
    @Column(useAccessMethods = true)
    private String elementoSpinnerSeleccionado;
    @IgnoreColumn
    @Nullable
    private int color;
    @Nullable
    @Column(useAccessMethods = true)
    private Integer elementoRadioButtonPresionado;

    public SurveyVariablesObjectCard() {
    }

    public SurveyVariablesObjectCard(String titulo, Boolean radiosEnabled, int numeroRadios, List<List<String>> listaRadioButtons, String variableSpinner, Boolean spinner, List<String> listaSpinner, List<Boolean> activeRadios, int color) {

        this.titulo = titulo;
        this.radiosEnabled = radiosEnabled;
        this.numeroRadios = numeroRadios;
        this.listaRadioButtons = listaRadioButtons;
        this.variableSpinner = variableSpinner;
        this.spinner = spinner;
        this.listaSpinner = listaSpinner;
        this.activeRadios = activeRadios;
        this.color = color;
    }

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

    public String getElementoSpinnerSeleccionado() {
        return elementoSpinnerSeleccionado;
    }

    public void setElementoSpinnerSeleccionado(String elementoSpinnerSeleccionado) {
        this.elementoSpinnerSeleccionado = elementoSpinnerSeleccionado;
    }

    public Integer getElementoRadioButtonPresionado() {
        return elementoRadioButtonPresionado;
    }

    public void setElementoRadioButtonPresionado(@Nullable Integer elementoRadioButtonPresionado) {
        this.elementoRadioButtonPresionado = elementoRadioButtonPresionado;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


}
