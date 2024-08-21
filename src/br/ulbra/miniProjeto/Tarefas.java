package br.ulbra.miniProjeto;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Tarefas {

    public ArrayList listaTarefas;

    public Tarefas() {
        listaTarefas = new ArrayList();
    }

    public void adicionar(String tarefa) {
        listaTarefas.add(tarefa);

        if (tarefa.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome do perfume.");
        } else {
            JOptionPane.showMessageDialog(null, tarefa + ", Salvo com sucesso!");
        }

    }

    public void editar(int i, String novaTarefa) {
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio");
        } else if (i > listaTarefas.size() || i > 1) {
            JOptionPane.showMessageDialog(null, "Tarefa não existe");
        } else {
            listaTarefas.set(i, novaTarefa);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }
    }

    public void remover(int i) {
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio");
        } else if (i >= listaTarefas.size() || i > 1) {
            JOptionPane.showMessageDialog(null, "Tarefa não existe");
        } else {
            listaTarefas.remove(i);
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }
    }

    public String visualizar() {
        String tarefas = "Lista de Tarefas \n";
        if (listaTarefas.isEmpty()) {
            return "Lista Vazia";
        } else {
            for (int i = 0; i < listaTarefas.size(); i++) {
                tarefas += (i + 1) + " - " + listaTarefas.get(i) + "\n";

            }
            return tarefas;
        }
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public void ordenarTarefas() {
        Collections.sort(listaTarefas);
        JOptionPane.showMessageDialog(null, "Lista Ordenada ");
    }
    public void limparTudo(){
        listaTarefas.clear();
    }
}
