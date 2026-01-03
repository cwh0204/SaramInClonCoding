import JobSection from "./JobSection"
import Card from "../ui/Card"

function JobLocationSection() {
  return (
    <>
    <JobSection title="근무지역">
        <Card className="p-[20px] text-[13px] text-[#444] space-y-[8px]">
            <p>서울 강남구 도산대로 138</p>
            <p>서울 3호선 신사역에서 500m 이내</p>
            <button className="mt-[12px] text-[#2563eb] text-[13px]"></button>
        </Card>
    </JobSection>
    </>
  )
}

export default JobLocationSection