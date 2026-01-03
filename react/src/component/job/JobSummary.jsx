import Button from "../ui/Button";
import Badge from "../ui/Badge";


function JobSummary({company, title, meta = []}) {
  return <>
    <div className="flex justify-between gap-[24px]">
      <div className="flex-1">
        <div className="flex items-center gap-[8px] mb-[8px]">
          <span className="text-[14px] text-[#444] font-medium">
            {company}
          </span>
          <Badge>관심기업</Badge>
        </div>

        {/* 공고제목부분 */}
        <h1 className="text-[22px] font-semibold leading-[30px] mb-[12px]">
          {title}
        </h1>

        {/* 메타정보 */}
        <div className="flex flex-wrap gap-x-[12px] text-[13px] text-[#666]">
          {meta.map((item, index)=>(
            <span key={index}>{item}</span>
          ))}
        </div>
      </div>

      <div className="flex items-start">
        <Button className="w-[160px]">입사지원</Button>
        </div>
    </div>
  </>;
}

export default JobSummary;
