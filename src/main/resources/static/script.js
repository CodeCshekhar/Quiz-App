document.getElementById("start-btn").addEventListener("click", function () {
    fetchQuestions();
});

async function fetchQuestions() {
    try {
        const response = await fetch("http://localhost:8080/questions/fetch");
        const questions = await response.json();
        startQuiz(questions);
    } catch (error) {
        console.error("Error fetching questions:", error);
    }
}

let currentQuestionIndex = 0;
let score = 0;
let questions = [];

function startQuiz(loadedQuestions) {
    questions = loadedQuestions;
    document.getElementById("instructions").classList.add("hidden");
    document.getElementById("quiz-container").classList.remove("hidden");
    showQuestion();
}

function showQuestion() {
    if (currentQuestionIndex >= questions.length) {
        endQuiz();
        return;
    }
    
    const questionObj = questions[currentQuestionIndex];
    document.getElementById("question-text").innerText = questionObj.questionText;
    const optionsContainer = document.getElementById("options");
    optionsContainer.innerHTML = "";

    for (let i = 1; i <= 4; i++) {
        const optionText = questionObj[`option${i}`];
        const button = document.createElement("button");
        button.className = "option";
        button.innerText = optionText;
        button.onclick = () => selectAnswer(optionText);
        optionsContainer.appendChild(button);
    }
}

function selectAnswer(answer) {
    if (answer === questions[currentQuestionIndex].correctAnswer) {
        score++;
    }
    currentQuestionIndex++;
    showQuestion();
}

function endQuiz() {
    document.getElementById("quiz-container").classList.add("hidden");
    document.getElementById("result").classList.remove("hidden");
    document.getElementById("score").innerText = `Your score: ${score}/${questions.length}`;
}

function restartQuiz() {
    currentQuestionIndex = 0;
    score = 0;
    document.getElementById("result").classList.add("hidden");
    document.getElementById("instructions").classList.remove("hidden");
}
