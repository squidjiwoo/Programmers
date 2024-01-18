# [level 0] n 번째 원소까지 - 181889 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181889) 

### 성능 요약

메모리: 72.5 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 1월 4일 16:32:49

### 문제 설명

<p style="user-select: auto !important;">정수 리스트 <code style="user-select: auto !important;">num_list</code>와 정수 <code style="user-select: auto !important;">n</code>이 주어질 때, <code style="user-select: auto !important;">num_list</code>의 첫 번째 원소부터 <code style="user-select: auto !important;">n</code> 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">num_list</code>의 길이 ≤ 30</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">num_list</code>의 원소 ≤ 9</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ <code style="user-select: auto !important;">num_list</code>의 길이
___</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num_list</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 1, 6]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[2]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[5, 2, 1, 7, 5]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">[5, 2, 1]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges