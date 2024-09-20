import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class SistemaProporcional extends JFrame {
    private JTextField txtTotalVotosValidos, txtNumeroCargos;
    private JTextField[] txtVotosCandidatos;
    private JLabel lblResultadoQE, lblResultadoVNM, lblDistribuicaoVagas;

    public SistemaProporcional() {
        setTitle("Sistema Proporcional - Simulação de Votação");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2));

        JLabel lblTotalVotosValidos = new JLabel("Total de Votos Válidos:");
        txtTotalVotosValidos = new JTextField();

        JLabel lblNumeroCargos = new JLabel("Número de Cargos:");
        txtNumeroCargos = new JTextField();

        // Adicionando campos para os votos de 5 candidatos fictícios
        txtVotosCandidatos = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            txtVotosCandidatos[i] = new JTextField();
            add(new JLabel("Votos Candidato " + (i + 1) + ":"));
            add(txtVotosCandidatos[i]);
        }

        JButton btnCalcular = new JButton("Calcular");

        lblResultadoQE = new JLabel("Quociente Eleitoral (QE):");
        lblResultadoVNM = new JLabel("Votação Nominal Mínima (VNM):");
        lblDistribuicaoVagas = new JLabel("Distribuição de Vagas:");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        add(lblTotalVotosValidos);
        add(txtTotalVotosValidos);
        add(lblNumeroCargos);
        add(txtNumeroCargos);
        add(btnCalcular);
        add(new JLabel());
        add(lblResultadoQE);
        add(new JLabel());
        add(lblResultadoVNM);
        add(new JLabel());
        add(lblDistribuicaoVagas);
        add(new JLabel());
    }

    private void calcular() {
        try {
            int totalVotosValidos = Integer.parseInt(txtTotalVotosValidos.getText());
            int numeroCargos = Integer.parseInt(txtNumeroCargos.getText());

            // Cálculo do QE (Quociente Eleitoral)
            double quocienteEleitoral = (double) totalVotosValidos / numeroCargos;

            // Cálculo do VNM (Votação Nominal Mínima - 10% do QE)
            double votacaoNominalMinima = quocienteEleitoral * 0.10;

            lblResultadoQE.setText("Quociente Eleitoral (QE): " + String.format("%.2f", quocienteEleitoral));
            lblResultadoVNM.setText("Votação Nominal Mínima (VNM): " + String.format("%.2f", votacaoNominalMinima));

            // Coletando os votos dos candidatos
            int[] votosCandidatos = new int[5];
            for (int i = 0; i < 5; i++) {
                votosCandidatos[i] = Integer.parseInt(txtVotosCandidatos[i].getText());
            }

            // Distribuindo as vagas
            StringBuilder distribuicaoVagas = new StringBuilder("<html>Distribuição de Vagas:<br>");
            for (int i = 0; i < 5; i++) {
                int vagas = (int) (votosCandidatos[i] / quocienteEleitoral);
                distribuicaoVagas.append("Candidato ").append(i + 1).append(": ").append(vagas).append(" vaga(s)<br>");
            }
            distribuicaoVagas.append("</html>");
            lblDistribuicaoVagas.setText(distribuicaoVagas.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemaProporcional().setVisible(true);
            }
        });
    }
}