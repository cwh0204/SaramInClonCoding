function JobInfoRow({ label, value, highlight = false, suffix }) {
  return (
    <div className="flex py-[6px] leading-[22px]">
      {/* label */}
      <span className="w-[92px] text-[13px] text-[#666] font-normal">{label}</span>

      {/* value */}
      <span className={`text-[13px] leading-[22px] font-normal ${highlight ? "text-[#2563eb]" : "text-[#222]"}`}>
        {value}
        {suffix && <span className="ml-[2px] text-[#2563eb]">{suffix}</span>}
      </span>
    </div>
  );
}

export default JobInfoRow;

// function JobInfoRow({ label, value, highlight = false, suffix }) {
//   return (
//     <div className="flex py-[6px] leading-[22px]">
//       <span className="w-[92px] text-[13px] text-[#666] font-normal"></span>
//       {label}
//       <span className={`text-[13px] ${highlight ? "text-[#2563eb] font-medium" : "text-[#222] font-normal"}`}>
//         {value}
//         {suffix && <span className="ml-[2px] text-[#2563eb]">{suffix}</span>}
//       </span>
//     </div>
//   );
// }

// export default JobInfoRow;

// 글자 크기를 조절할때는 line-height라는 속성까지 신경써야 한다.
// font-size만으로는 부족하다.
// 왜냐하면 font-size만 있으면,
// 글자 자체 높이 13px
// 위/아래/ 여백: 브라우저 기본값(이것은 불규칙적이다.)
// 그래서 줄간격이 제각각이다. -> 이렇게 되면 UI가 흐트러지는 것처럼 보인다.

// line-height/leading(tailwindcss)가 하는 역할
// 한 줄 전체의 높이를 가리킨다.
// leading은 글자를 감싸는 ‘보이지 않는 줄 박스의 높이’다.
// UI 타이포그래피의 핵심이다.
