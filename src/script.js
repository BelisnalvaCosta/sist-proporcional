function calcular() {
    // Coletando dados do formulário
    const totalVotosValidos = parseInt(document.getElementById("totalVotos").value);
    const numeroCargos = parseInt(document.getElementById("numCargos").value);

    const votosCandidato1 = parseInt(document.getElementById("candidato1").value);
    const votosCandidato2 = parseInt(document.getElementById("candidato2").value);
    const votosCandidato3 = parseInt(document.getElementById("candidato3").value);
    const votosCandidato4 = parseInt(document.getElementById("candidato4").value);
    const votosCandidato5 = parseInt(document.getElementById("candidato5").value);

    // Cálculo do Quociente Eleitoral (QE)
    const quocienteEleitoral = totalVotosValidos / numeroCargos;

    // Cálculo da Votação Nominal Mínima (VNM - 10% do QE)
    const votacaoNominalMinima = quocienteEleitoral * 0.10;

    // Cálculo de vagas para cada candidato
    const vagasCandidato1 = Math.floor(votosCandidato1 / quocienteEleitoral);
    const vagasCandidato2 = Math.floor(votosCandidato2 / quocienteEleitoral);
    const vagasCandidato3 = Math.floor(votosCandidato3 / quocienteEleitoral);
    const vagasCandidato4 = Math.floor(votosCandidato4 / quocienteEleitoral);
    const vagasCandidato5 = Math.floor(votosCandidato5 / quocienteEleitoral);

    // Exibindo resultados na página
    document.getElementById("qe").innerText = `Quociente Eleitoral (QE): ${quocienteEleitoral.toFixed(2)}`;
    document.getElementById("vnm").innerText = `Votação Nominal Mínima (VNM): ${votacaoNominalMinima.toFixed(2)}`;

    document.getElementById("distribuicao").innerHTML = `
        Distribuição de Vagas:<br>
        Candidato 1 (Ana): ${vagasCandidato1} vaga(s)<br>
        Candidato 2 (Bruno): ${vagasCandidato2} vaga(s)<br>
        Candidato 3 (Carlos): ${vagasCandidato3} vaga(s)<br>
        Candidato 4 (Daniela): ${vagasCandidato4} vaga(s)<br>
        Candidato 5 (Eduardo): ${vagasCandidato5} vaga(s)
    `;
}
