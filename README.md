# BaekJoon Solutions

백준 온라인 저지(BOJ) 문제 풀이 저장소입니다. 여러 언어(Python/Java/JavaScript)로 풀이를 정리합니다.

## 📁 저장소 구조

```text
BaekJoon/
├─ baekjoonWithJava/      # Java 풀이
├─ js/                    # JavaScript(Node.js) 풀이
├─ python/                # Python 풀이
├─ problemListJava/       # Java 풀이 대상/진행 목록
├─ problemListJs/         # JS 풀이 대상/진행 목록
├─ problemListPython/     # Python 풀이 대상/진행 목록
├─ .gitignore
└─ README.md
```
## 🧭 네이밍 & 구성 가이드(권장)

- **파일명**: `BOJ_<문제번호>.<확장자>` (예: `BOJ_1000.py`, `BOJ_1000.java`, `BOJ_1000.js`)
- **폴더 배치**: 사용 언어별 디렉터리 하위에 문제 단위 파일 배치  
  (예: Python 풀이는 `python/BOJ_1000.py`)
- **문제 목록 디렉터리**(`problemList*`): 풀 예정/진행/완료 문제 번호, 주제(분류), 난이도 등을 메모하는 용도로 사용

## ▶️ 실행 방법

### Python
```bash
# 예: 1000번 문제 풀이 실행
python3 BOJ_1000.py
```

### Java
```bash
# 컴파일
javac Main.java
# 실행
java Main
```

### JavaScript (Node.js)
```bash
# 예: 1000번 문제 풀이 실행
node BOJ_1000.js
```

## ⌨️ 입출력 팁(로컬 테스트)

- 대부분의 BOJ 문제는 **표준 입력/출력(STDIN/STDOUT)** 을 사용합니다.
- 로컬에서 샘플 입력으로 테스트할 때:
  - **Python**
    ```bash
    python3 BOJ_1000.py < input.txt
    ```
  - **Java**
    ```bash
    java Main < input.txt
    ```
  - **Node.js**
    ```bash
    node BOJ_1000.js < input.txt
    ```

## 🧪 예시 입출력(샘플)

```bash
node BOJ_1000.js < input.txt > actual.txt
diff -u expected.txt actual.txt
```

## 🧠 풀이 원칙(권장)

- **정확성 → 효율성** 순서로 접근  
- **모듈화**: 입출력, 로직, 유틸 함수 분리  
- **문제별 기록(선택)**: 접근 아이디어, 복잡도, 실수 포인트 간단 메모

## 📌 커밋 메시지 컨벤션(예시)

- `feat(py): BOJ 1000 A+B`
- `fix(java): BOJ 1546 반올림 오류 수정`
- `refactor(js): 입력 파싱 함수 분리`
- `docs: README 실행 방법 보강`

## 🔗 참고

- 백준 온라인 저지: https://www.acmicpc.net/
